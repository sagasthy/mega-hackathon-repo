import React from 'react';
import { Container, Navbar } from "react-bootstrap";

import { Link } from "react-router-dom";
import "./css/Homepage.css";
import Logo from './Logo.png';
import Header from './header/navBarHeader';

const HomePage = () => {
  return (
    <>
      
        <Header />
      <Container className="home-content">
        <h1>Welcome to the CREATIVTALE platform</h1>
        <p>This is a platform where you can read and write stories, and connect with other storytellers around the world.
        CREATIVTALE is a platform that seeks to give everyone access to their creative side.
        </p>
        <div className="cta">
          <Link to="/signup" className="btn btn-primary btn-lg">Sign Up</Link>
          <Link to="/login" className="btn btn-outline-primary btn-lg">Log In</Link>
        </div>
      </Container>
    </>
  );
};

export default HomePage;
