import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import LoginPage from "./auth/login";
import SignupPage from "./auth/signup";

const App = () => {
  return (
    <div>
    <Router>
      <div>
        <Routes>
        <Route exact path="/" element={<LoginPage />} />
          <Route path="/signup" element={<SignupPage />} />
          </Routes>
      </div>
    </Router>
    </div>
  );
}

export default App;
