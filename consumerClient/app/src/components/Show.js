import React from 'react';
import { Button, Row, Col, Container, Card, ListGroup, ListGroupItem } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Link } from 'react-router-dom';

function Show(props) {
  var base64 = btoa(new Uint8Array(props.show.image)
      .reduce((data, byte) => data + String.fromCharCode(byte), ''));

  var base64Image = 'data:image/png;base64,'+{base64};
  return (
    <>
      <Card
        className="mx-4 my-4"
        bg="secondary"
        key={"key1"}
        style={{ width: '18rem' }}>
        <Card.Img variant="top" src={`data:image/png;base64,${base64}`} width="100" height="600" fluid/>
        <Card.Body>
          <Card.Title>{props.show.title}</Card.Title>
        </Card.Body>
        <ListGroup className="list-group-flush">
          <ListGroupItem>Description : {props.show.genre}</ListGroupItem>
          <ListGroupItem>Type : {props.show.type}</ListGroupItem>
          <ListGroupItem>Produced : {props.show.year}</ListGroupItem>
          <ListGroupItem>Star Actor : {props.show.starActorFk.firstname} {props.show.starActorFk.lastname}</ListGroupItem>
        </ListGroup>
        <Card.Body>
          <Link to={{pathname:'/Watch', watch:props.show}}>
            <Button>Watch</Button>
            </Link>
        </Card.Body>
      </Card>

    </>
  );
}

export default Show;