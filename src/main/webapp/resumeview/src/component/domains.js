import React,{Component} from 'react';
import {Card, Table} from 'react-bootstrap';

class Domains extends Component{
	render(){
		return (
			<Card className={"border border-dark bg-dark text-white"}>
				<Card.Header>List Of Domains</Card.Header>
				<Card.Body>
					<Table striped bordered hover variant="dark">
						<thead>
							<tr>
							  <th>#</th>
							  <th>Name</th>
							  <th>description</th>
							  <th>Edit</th>
							</tr>
							</thead>
							<tbody>
							<tr align="center">
							  <td colSpan="6"> add a domain first </td>
							</tr>
							
							</tbody>
						</Table>
				</Card.Body>

			</Card>

			);
	}
}
export default Domains;