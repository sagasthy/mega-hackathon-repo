import React from 'react';
import { Container, Navbar } from "react-bootstrap";
import Logo from '../Logo.png';
import { Link } from "react-router-dom";

const NavBarHeader = () => {
    return (
        <Navbar bg="dark" variant="dark" expand="lg">
        <Container>
          <Navbar.Brand>
            <img
              src={Logo}
              alt="Logo"
              width="150"
              height="50"
              className="d-inline-block align-top"
            />
            <span className="brand-name"></span>
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <ul className="navbar-nav ml-auto">
              <li className="nav-item active">
                <Link to="/" className="nav-link">Home</Link>
              </li>
              <li className="nav-item">
                <Link to="/stories" className="nav-link">Stories</Link>
              </li>
              <li className="nav-item">
                <Link to="/dashboard" className="nav-link">Dashboard</Link>
              </li>
            </ul>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    );
};

export default NavBarHeader;
