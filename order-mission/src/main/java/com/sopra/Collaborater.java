package com.sopra;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="collaborater")
public class Collaborater {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="collab_name")
	private String collabName;
	
	@Column(name="Collab_firstName")
	private String collabFirstName;
	
	@Column(name="date")
	private String date;
	
	@Column(name="project")
	private String project;
	
	@Column(name="agency")
	private String agency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollabName() {
		return collabName;
	}

	public void setCollabName(String collabName) {
		this.collabName = collabName;
	}

	public String getCollabFirstName() {
		return collabFirstName;
	}

	public void setCollabFirstName(String collabFirstName) {
		this.collabFirstName = collabFirstName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	@Override
	public String toString() {
		return "TaKK [id=" + id + ", collabName=" + collabName + ", collabFirstName=" + collabFirstName + ", date="
				+ date + ", project=" + project + ", agency=" + agency + "]";
	}
	

}

