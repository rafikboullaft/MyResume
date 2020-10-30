package me.rafikBoullaft.resume.Domains;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class domainController {
	
	@Autowired
	private DomainServices domainServices; 
	//@CrossOrigin(origins="http://localhost:8080/")
	@RequestMapping("/domains")
	public List<domain> findAllDomains() {
		return domainServices.getAlldomains();
	}
	@RequestMapping("/domains/{id}")
	public Optional<domain> findone(@PathVariable String id){
		return domainServices.findOne(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/domains")
	public void addDomain(@RequestBody domain domain) {
		domainServices.addDomain(domain);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/domains/{id}")
	public void addDomain(@RequestBody domain domain,@PathVariable String id) {
		domainServices.updateDomain(id,domain);
	}
	@RequestMapping(method=RequestMethod.DELETE ,value="/domains/{id}")
	public void delete(@PathVariable String id){
		domainServices.deleteDomain(id);
	}

}
