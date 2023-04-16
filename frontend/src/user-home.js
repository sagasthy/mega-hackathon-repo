import React from 'react';
import { Container, Navbar } from "react-bootstrap";
import { Text } from "react-bootstrap-text";
import "./css/SignupPage.css";
import Logo from './Logo.png';

const UserHomePage = () => {
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
                <Text uppercase bold underline>This text is uppercase, bold and underlined</Text>
            </Container>
        </>
    );
};

export default UserHomePage;