import React from 'react';
import { Button, Row, Col, Container, Card, Nav} from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import logo from '../logo.svg';
import Movies from './Movies';
import Shows from './Shows';

function Content() {
  return (
      <>
      <Card>
  <Card.Header>
    <Nav justify variant="tabs" defaultActiveKey="/Movies">
      <Nav.Item>
        <Nav.Link href="/Movies">Movies</Nav.Link>
      </Nav.Item>
      <Nav.Item>
        <Nav.Link href="/Shows">Shows</Nav.Link>
      </Nav.Item>
    </Nav>
  </Card.Header>
  <Card.Body>
  </Card.Body>
</Card>       
      </>
  );
}

export default Content;