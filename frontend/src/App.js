import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import HomePage from './home.js';
import UserHomePage from './user-home.js'
import LoginPage from "./auth/login";
import SignupPage from "./auth/signup";
import EditPage from "./editor";
import ViewPage from "./viewer";

const App = () => {
  return (
    <div>
    <Router>
      <div>
        <Routes>
          <Route exact path='/' element={<HomePage />} />
          <Route exact path="/login" element={<LoginPage />} />
          <Route path="/signup" element={<SignupPage />} />
          <Route path="/user" element={<UserHomePage />} />
          <Route path="edit" element={<EditPage />} />
          <Route path="view/:storyid" element={<ViewPage />} />
          </Routes>
      </div>
    </Router>
    </div>
  );
}

export default App;
