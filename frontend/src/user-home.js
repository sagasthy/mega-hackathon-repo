import React, { useState, useEffect } from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import axios from 'axios';
import Header from './header/header';

const UserHomePage = () => {
  const [stories, setStories] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8081/stories/get-list/user1')
      .then(response => {
        setStories(response.data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <>
      <Header />
      <Container>
      <Row>
        <Col key="1234" md={20}>
              <div className="tile">                
                <p>You can upload your own short stories, receive feedback from others, read what other users have written, write your own 
opinions about others’ work and more.
</p>
              </div>
            </Col>
            </Row>
        <Row>
        
          {stories.map(story => (
            <Col key={story.id} md={4}>
              <div className="tile">                
                <p>{story.storyContent}</p>
              </div>
            </Col>
          ))}
        </Row>
      </Container>
    </>
  );
};

export default UserHomePage;
