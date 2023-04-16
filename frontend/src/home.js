import React from 'react';
import { Container, Navbar } from "react-bootstrap";
import { Text } from "react-bootstrap-text";
import { Link } from "react-router-dom";
import "./css/SignupPage.css";
import Logo from './Logo.png';

const HomePage = () => {
    return (
        <>
            <Navbar bg="dark">
                <Container>
                    <Navbar.Brand href="#home">
                        <img
                            src={Logo}
                            width="120"
                            height="30"
                            className="d-inline-block align-top"
                            alt="React Bootstrap logo"
                        />
                    </Navbar.Brand>
                </Container>
            </Navbar>
            <Container>
                <Text bold>CREATIVTALE is a platform that seeks to give everyone access to their creative side.</Text>
                <Text>You can upload your own short stories, receive feedback from others, read what other users have written, write your own 
opinions about others’ work and more.</Text>
                <div className="text-center mt-3">
                    Sign Up Now!!! <Link to="/signup">Sign Up</Link>
                </div>
            </Container>
        </>
    );
};

export default HomePage;