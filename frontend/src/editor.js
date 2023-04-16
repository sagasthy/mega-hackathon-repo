import React, { useState } from "react";
import { Form, Button, Container, Row, Col } from "react-bootstrap";
import ReactQuill from "react-quill";
import 'react-quill/dist/quill.snow.css';

function CreateStoryPage() {
  const [content, setContent] = useState("");

  return (
    <Container className="bg-light p-5">
        <Row>
            <div>
                Edit Story Page
            </div>
            <ReactQuill theme="snow" value={content} onChange={setContent} />
            <Col>
                <Button onClick={()=>console.log("TEST")}>Save</Button>
            </Col>
        </Row>
    </Container>
  );
}

export default CreateStoryPage;
