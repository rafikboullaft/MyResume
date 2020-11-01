import React from "react";
import {Navbar,Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';

class NavBar extends React.Component {
	render(){
		return (
			<Navbar bg="dark" variant="dark">
				<Link to={""} className='navbar-brand'>
						Rafik Boullaft
				</Link>
				
				<Nav className="mr-auto">
      				<Link to={""} className='nav-link'>home</Link>
      				<Link to={"add"} className='nav-link'>domains</Link>
      				<Link to={"list"} className='nav-link'>technologies</Link>
      				<Link to={""} className='nav-link'>projects</Link>
      
    			</Nav>
			</Navbar>
		);
	}
} 
export default NavBar;