package me.rafikBoullaft.resume.Techs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TechServices {
	
	@Autowired
	private techRepository techRepository;
	
	/*
	 * private List<tech> techs= new ArrayList<>(Arrays.asList( new
	 * tech("DataId","data","ai, ml , bi ....","photopathData"), new
	 * tech("webId","web","programing ....","photopathweb"), new
	 * tech("mobileId","mobile","android ....","photopatmobile") ));
	 */
	public List<tech> getAlltechs(String id){
		//return techs;
		List<tech> techs = new ArrayList<>();
		techRepository.findByDomainId(id).forEach(techs::add);
		return techs;
	}
	public Optional<tech> findOne(String id) {
		//return techs.stream().filter(d -> d.getId().equals(id)).findFirst().get();
		return techRepository.findById(id);
	}
	public void addTech(tech tech) {
		//techs.add(tech);
		techRepository.save(tech);
	}
	
	public void updateTech(String id, tech tech) {
		/*
		 * for (int i=0;i<techs.size();i++) { tech d = techs.get(i);
		 * if(d.getId().equals(id)) { techs.set(i, tech); return; } }
		 */
		techRepository.save(tech);
	}
	public void deleteTech(String id) {
		//techs.removeIf( t -> t.getId().equals(id));
		techRepository.deleteById(id);	
	}

}
