package me.rafikBoullaft.resume.Domains;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class domain {
	
	@Id
	String Id;
	String name;
	String description;
	String photo;
	public domain() {
		
	}
	public domain(String id, String name, String description, String photo) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.photo = photo;
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
	

}
