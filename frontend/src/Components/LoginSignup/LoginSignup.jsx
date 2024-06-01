import React, {useState} from "react";
import './LoginSignup.css'
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faEnvelope, faKey, faUser} from "@fortawesome/free-solid-svg-icons";

const LoginSignup = () => {
    const [action,setAction] = useState("Sign Up");

    return (
        <div className='container'>
            <div className="header">
                <div className="text">{action}</div>
                <div className="underline"></div>
            </div>
            <div className="inputs">
                {action === "Login" ? <div></div> : <div className="input">
                    <FontAwesomeIcon className="icon" icon={faUser}/>
                    <input type="text" placeholder="Username"/>
                </div>}
                <div className="input">
                    <FontAwesomeIcon className="icon" icon={faEnvelope}/>
                    <input type="email" placeholder="Email"/>
                </div>
                <div className="input">
                    <FontAwesomeIcon className="icon" icon={faKey} />
                    <input type="password" placeholder="Password"/>
                </div>
            </div>
            {action === "Sign Up" ? <div></div> :
                <div className="forgot-password">Forgot password? <span>Click here.</span></div>}
            <div className="submit-container">
                <div className={action==="Login"?"submit gray":"submit"} onClick={() => {setAction("Sign Up")}}>Sign Up</div>
                <div className={action==="Sign Up"?"submit gray":"submit"} onClick={() => {setAction("Login")}}>Login</div>
            </div>
        </div>
    )
}

export default LoginSignup