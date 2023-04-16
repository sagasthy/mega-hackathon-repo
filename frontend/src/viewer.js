import React, { useState, useEffect } from "react";
import { Form, Button, Container, Row, Col } from "react-bootstrap";
import ReactQuill from "react-quill";
import 'react-quill/dist/quill.snow.css';
import axios from "axios";

function ViewStoryPage() {
    const [content, setContent] = useState("");

    useEffect(() => {
        console.log("GET STORY")
        const testingStory = 1
        axios.get(`http://localhost:8081/stories/get-story/${testingStory}`)
            .then(response => setContent(response.data.storyContent));
    }, [])

  return (
    <Container className="bg-light p-5">
        <Row>
            <ReactQuill theme="snow" value={content} readOnly />
        </Row>
    </Container>
  );
}

export default ViewStoryPage;
