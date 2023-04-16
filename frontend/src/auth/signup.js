import React, { useState } from "react";
import { Form, Button, Container, Row, Col } from "react-bootstrap";
import { Link } from "react-router-dom";
import "../css/SignupPage.css";

function SignupPage() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (event) => {
    event.preventDefault();
    // TODO: Add signup logic here
  };

  return (
    <Container fluid className="signup-background">
      <Row>
        <Col md={{ span: 6, offset: 3 }} className="signup-form">
          <h1 className="signup-heading">Create an Account</h1>
          <Form onSubmit={handleSubmit}>
            <Form.Group controlId="formBasicName">
              <Form.Label className="signup-label">Name</Form.Label>
              <Form.Control
                type="text"
                placeholder="Enter name"
                value={name}
                onChange={(event) => setName(event.target.value)}
              />
            </Form.Group>

            <Form.Group controlId="formBasicEmail">
              <Form.Label className="signup-label">Email address</Form.Label>
              <Form.Control
                type="email"
                placeholder="Enter email"
                value={email}
                onChange={(event) => setEmail(event.target.value)}
              />
            </Form.Group>

            <Form.Group controlId="formBasicPassword">
              <Form.Label className="signup-label">Password</Form.Label>
              <Form.Control
                type="password"
                placeholder="Password"
                value={password}
                onChange={(event) => setPassword(event.target.value)}
              />
            </Form.Group>

            <Button variant="primary" type="submit" className="signup-button">
              Sign Up
            </Button>
          </Form>
          <div className="text-center mt-3">
            Already have an account? <Link to="/login">Log In</Link>
          </div>
        </Col>
      </Row>
    </Container>
  );
}

export default SignupPage;
