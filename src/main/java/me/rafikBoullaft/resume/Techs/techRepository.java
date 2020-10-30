package me.rafikBoullaft.resume.Techs;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface techRepository extends CrudRepository<tech,String> {
	public List<tech> findByDomainId(String domainId);

}
