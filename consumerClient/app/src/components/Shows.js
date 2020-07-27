import React from 'react';
import {Row} from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import Show from './Show';

function Shows(props) {
  return (
    <Row border="dark" lg={3} className="justify-content-md-center">
    {props.shows.map(
      (show, index)=>(
      <Show key={index} show={show}/>
      ))}
      </Row>
  );
}

export default Shows;