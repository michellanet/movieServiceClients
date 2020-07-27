import React, { useEffect, useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Shows from './components/Shows';
import Movies from './components/Movies';
import Content from './components/Content';
import Watch from './components/Watch';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import axios from 'axios';

function App() {

  // title, type, year, genre, thumbnail, starActorFk(firstname lastname)
  let [movies, setMovies] = useState([]);
  let [shows, setShows] = useState([]);

  function getShows() {
    return axios.get('http://localhost:8080/moviesRestService/api/movies/Show');
  }
   
  function getMovies() {
    return axios.get('http://localhost:8080/moviesRestService/api/movies/Movie');
  }
   
  useEffect(() => {
  axios.all([getMovies(), getShows()])
    .then(axios.spread(function (resMovies, resShows) {
      setMovies(resMovies.data);
      setShows(resShows.data);
    }));
  },[]);
    
  return (
            <>
      <BrowserRouter>
      <Content/>
      <Switch>
        <Route path='/' exact render={()=><Movies movies={movies} />} />

        <Route path='/movies' render={()=><Movies movies={movies} />} />

        <Route path='/shows' render={()=><Shows shows={shows} />} />
        <Route path='/watch' component={Watch} />
        </Switch>
      </BrowserRouter>
    </>
  );
}

export default App;