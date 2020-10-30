package me.rafikBoullaft.resume.Techs;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import me.rafikBoullaft.resume.Domains.domain;
@Entity
public class tech {
	
	@Id
	String Id;
	String name;
	String description;
	String photo;
	@ManyToOne
	domain domain;
	
	
	public tech() {
		
	}
	public tech(String id, String name, String description, String photo, domain domain) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.photo = photo;
		this.domain = domain;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public domain getDomain() {
		return domain;
	}
	public void setDomain(domain domain) {
		this.domain = domain;
	}
	

}
