import React from "react";
import './App.css';
import NavBar from "./component/navigationbar";
import JumboTron from "./component/jumbotron";
import Domains from "./component/domains";
import Techs from "./component/techs";
import Footer from "./component/footer"; 
import {Container, Col, Row} from 'react-bootstrap';
import {BrowserRouter as Router, Switch, Route} from "react-router-dom"; 
export default function App() {
	const marginTop = {
		marginTop :"20px"
	};
  return (
    <Router>
    <NavBar/>
    <Container>
		<Row>
			<Col lg={12} style={marginTop} >
				<Switch>
					<Route path="/" exact component={JumboTron}/>
					<Route path="/add" exact component={Domains}/>
					<Route path="/list" exact component={Techs}/>	
				</Switch>
    			
    		</Col>
		</Row>
	</Container>
	<Footer/>
    </Router>
    
    
  );
};

