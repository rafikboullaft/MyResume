import React,{Component} from 'react';
import {Card,Form,Button,Col} from 'react-bootstrap';

export default class Techs extends Component{
	constructor(props){
		super(props);
		this.state = {Name:'',photo:'',description:''};
		this.submitDomain = this.submitDomain.bind(this);
		this.domainChange = this.domainChange.bind(this);
	}
	submitDomain(event) {
		alert("name :"+ this.state.Name +" photo:"+ this.state.photo+" description:"+ this.state.description);
		event.preventDefault();
	}
	domainChange(event){
		this.setState({
			[event.target.name] : event.target.value
		});
	}
	render(){
		return (
			<Card className={"border border-dark bg-dark text-white"}>
				<Card.Header>List Of Domains</Card.Header>
				<Form onSubmit={this.submitDomain} id="domainFormId">
				 <Card.Body>
				 	
					 	<Form.Row>
						 	<Form.Group as={Col} controlId="formGridTitle">
							    <Form.Label>Name</Form.Label>
							    <Form.Control required
							    			  type="text" name="Name"
							    			  value={this.state.Name}
							    			  onChange={this.domainChange} 
							    			  className={"bg-dark text-white"}
							    			  placeholder="Enter the name" />
						  	</Form.Group>
						  	<Form.Group as={Col} controlId="formGridPhoto">
							    <Form.Label>photo</Form.Label>
							    <Form.Control required type="text" name="photo"
							    			  value={this.state.photo}
							    			  onChange={this.domainChange}
							    			  className={"bg-dark text-white"}
							    			  placeholder="Enter the photo URL" />
						  	</Form.Group>

					 	</Form.Row>
					 	<Form.Row>
						 	<Form.Group as={Col} controlId="formGridDescription">
							    <Form.Label>description</Form.Label>
							    <Form.Control required type="text" name="description"
							    			  value={this.state.description}
							    			  onChange={this.domainChange}
							    			  className={"bg-dark text-white"}
							    			  placeholder="Enter the description " />
						  	</Form.Group>
					 	</Form.Row>
					
					 </Card.Body>
					 <Card.Footer style={{"textAlign":"right"}}>
					 	 <Button size="sm" variant="success" type="submit">
						    Submit
						  </Button>
					 </Card.Footer>
				 </Form>
			</Card>
			);
	}
}
