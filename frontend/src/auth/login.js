import React, { useState } from "react";
import { Form, Button, Container, Row, Col } from "react-bootstrap";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";
import Header from "../header/header";

function LoginPage() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const navigate = useNavigate();

  const handleSubmit = async (event) => {
    event.preventDefault();
    // TODO: Add login logic here
    axios.post("http://localhost:8081/user/login", {
      userId: email      
    })
    .then((response) => {
      console.log(response.data);
      // Handle successful signup here
      navigate("/user")
    })
    .catch((error) => {
      console.log(error);
      // Handle error here
    });
  };

  return (
    <>
    <Header />
    <Container className="bg-light p-5">
      <Row>
        <Col md={{ span: 6, offset: 3 }}>
          <h1 className="mb-4 text-center">Login</h1>
          <Form onSubmit={handleSubmit}>
            <Form.Group controlId="formBasicEmail">
              <Form.Label>Email address</Form.Label>
              <Form.Control
                type="email"
                placeholder="Enter email"
                value={email}
                onChange={(event) => setEmail(event.target.value)}
              />
            </Form.Group>

            <Form.Group controlId="formBasicPassword">
              <Form.Label>Password</Form.Label>
              <Form.Control
                type="password"
                placeholder="Password"
                value={password}
                onChange={(event) => setPassword(event.target.value)}
              />
            </Form.Group>

            <Button variant="primary" type="submit" className="w-100 mt-3">
              Submit
            </Button>
          </Form>
          <div className="text-center mt-3">
            You don't have login? Please <Link to="/signup">SignUp</Link>
          </div>
        </Col>
      </Row>
    </Container>
    </>
  );
}

export default LoginPage;
