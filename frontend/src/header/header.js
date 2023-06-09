import React from 'react';
import { Container, Navbar } from "react-bootstrap";
import Logo from '../Logo.png';

const Header = () => {
    return (
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
    );
};

export default Header;
