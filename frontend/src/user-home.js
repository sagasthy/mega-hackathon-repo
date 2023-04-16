import React from 'react';
import { Container } from "react-bootstrap";
import { Text } from "react-bootstrap-text";
import "./css/SignupPage.css";
import Header from './header/header';

const UserHomePage = () => {
    return (
        <>
           <Header />
            <Container>
                <Text uppercase bold underline>This text is uppercase, bold and underlined</Text>
            </Container>
        </>
    );
};

export default UserHomePage;