package me.rafikBoullaft.resume.Techs;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import me.rafikBoullaft.resume.Domains.domain;

@RestController
public class techController {
	
	@Autowired
	private TechServices techServices; 
	//@CrossOrigin(origins="http://localhost:8080/")
	@RequestMapping("/domains/{id}/techs")
	public List<tech> findAllTechs(@PathVariable String id) {
		return techServices.getAlltechs(id);
	}
	@RequestMapping("/domains/{domainId}/techs/{id}")
	public Optional<tech> findone(@PathVariable String id){
		return techServices.findOne(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/domains/{domainId}/techs")
	public void addDomain(@RequestBody tech tech,@PathVariable String domainId) {
		tech.setDomain(new domain(domainId,"","",""));
		techServices.addTech(tech);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/domains/{domainId}/techs/{id}")
	public void updateDomain(@RequestBody tech tech,@PathVariable String domainId,@PathVariable String id) {
		tech.setDomain(new domain(domainId,"","",""));
		techServices.updateTech(id,tech);
	}
	@RequestMapping(method=RequestMethod.DELETE ,value="/domains/{domainId}/techs/{id}")
	public void delete(@PathVariable String id){
		techServices.deleteTech(id);
	}

}
