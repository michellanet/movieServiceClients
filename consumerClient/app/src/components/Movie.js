import React from 'react';
import { Button, Row, Col, Container, Card, Nav, ListGroup, ListGroupItem } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Link } from 'react-router-dom';

function Movie(props) {
  var base64 = btoa(new Uint8Array(props.movie.image)
      .reduce((data, byte) => data + String.fromCharCode(byte), ''));

  var base64Image = 'data:image/png;base64,'+{base64};
  
  return (
    <>
      <Card
        className="mx-4 my-4"
        bg="secondary"
        key={"key1"}
        style={{ width: '18rem' }}>
        <Card.Img variant="top" src={`data:image/png;base64,${base64}`} width="100" height="600"  fluid/>
        <Card.Body>
          <Card.Title>{props.movie.title}</Card.Title>
        </Card.Body>
        <ListGroup className="list-group-flush">
          <ListGroupItem>Description : {props.movie.genre}</ListGroupItem>
          <ListGroupItem>Type : {props.movie.type}</ListGroupItem>
          <ListGroupItem>Year Produced : {props.movie.year}</ListGroupItem>
          <ListGroupItem>Star Actor : {props.movie.starActorFk.firstname} {props.movie.starActorFk.lastname}</ListGroupItem>
        </ListGroup>
        <Card.Body>
          <Link to={{pathname:'/Watch', watch:props.movie}}>
            <Button>Watch</Button>
            </Link>
        </Card.Body>
      </Card>
    </>
  );
}

export default Movie;