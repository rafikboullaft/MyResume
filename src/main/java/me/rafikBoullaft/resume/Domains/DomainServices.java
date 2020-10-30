package me.rafikBoullaft.resume.Domains;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainServices {
	
	@Autowired
	private domainRepository domainRepository;
	
	/*
	 * private List<domain> domains= new ArrayList<>(Arrays.asList( new
	 * domain("DataId","data","ai, ml , bi ....","photopathData"), new
	 * domain("webId","web","programing ....","photopathweb"), new
	 * domain("mobileId","mobile","android ....","photopatmobile") ));
	 */
	public List<domain> getAlldomains(){
		//return domains;
		List<domain> domains = new ArrayList<>();
		domainRepository.findAll().forEach(domains::add);
		return domains;
	}
	public Optional<domain> findOne(String id) {
		//return domains.stream().filter(d -> d.getId().equals(id)).findFirst().get();
		return domainRepository.findById(id);
	}
	public void addDomain(domain domain) {
		//domains.add(domain);
		domainRepository.save(domain);
	}
	
	public void updateDomain(String id, domain domain) {
		/*
		 * for (int i=0;i<domains.size();i++) { domain d = domains.get(i);
		 * if(d.getId().equals(id)) { domains.set(i, domain); return; } }
		 */
		domainRepository.save(domain);
		
	}
	public void deleteDomain(String id) {
		
		//domains.removeIf( t -> t.getId().equals(id));
		domainRepository.deleteById(id);
			
	}

}
