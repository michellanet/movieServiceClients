import React from 'react';
import { Container, Card } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

function Watch(props) { 
  var base64 = btoa(new Uint8Array(props.location.watch.image)
      .reduce((data, byte) => data + String.fromCharCode(byte), ''));

  var base64Image = 'data:image/png;base64,'+{base64};
  
  return (
    <>
      <Container>
        <Card>
          <Card.Body>
            <Card.Title>{props.location.watch.title}</Card.Title> 
            <video width="100%" height="600" poster={`data:image/png;base64,${base64}`} controls>
              Your browser does not support the video tag.
              </video>
          </Card.Body>
        </Card>
      </Container>
    </>
  );
}

export default Watch;