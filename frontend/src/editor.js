import React, { useState } from "react";
import { Form, Button, Container, Row, Col } from "react-bootstrap";
import ReactQuill from "react-quill";
import 'react-quill/dist/quill.snow.css';
import axios from "axios";

function CreateStoryPage() {
    const [content, setContent] = useState("");

    const saveStory = async (userId, content) => { 
        console.log("SAVE REQUEST")
        const url = "http://localhost:8081/stories/new-story";
        let options = {
            method: "PUT",
            url: url,
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json;charset=UTF-8"
            },
            data: {
                "userId": userId,
                "content": content
            },
        };

        let response = await axios(options);
        if(response && response.status === 200)
            console.log(response.data)
        // axios.get(url).then(data => console.log(data))
    }

  return (
    <Container className="bg-light p-5">
        <Row>
            <Col sx={12}>
                <div>
                    Edit Story Page
                </div>
            </Col>
            <Col sx={1}>
                <Button onClick={() => saveStory(1, content)}>Save</Button>
            </Col>
            
            <ReactQuill theme="snow" value={content} onChange={setContent} />
        </Row>
    </Container>
  );
}

export default CreateStoryPage;
