import React from 'react';

import {Navbar, Container, Col, Row} from "react-bootstrap";

class Footer extends React.Component{
	render(){
		return (
			<Navbar fixed="bottom" bg="dark">
				<Container>
					<Row>
						<Col lg={12} className="text-center text-muted" >
    						<div>Rafik Boullaft</div>
    					</Col>
					</Row>
				</Container>
			</Navbar>

			);
	}
}
export default Footer;