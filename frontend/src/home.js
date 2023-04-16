import React from 'react';
import { Container } from "react-bootstrap";
import { Text } from "react-bootstrap-text";
import { Link } from "react-router-dom";
import "./css/SignupPage.css";
import Header from './header/header';

const HomePage = () => {
    return (
        <>
            <Header />
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