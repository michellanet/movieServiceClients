import React from 'react';
import {Row} from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import Movie from './Movie';

function Movies(props) {
  return (
    <Row border="dark" lg={3} className="justify-content-md-center">
    {props.movies.map(
      (movie, index)=>(<Movie key={index} movie={movie}/>))}
      </Row>
  );
}

export default Movies;