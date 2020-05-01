package com.nab.portfolio.entity;

import java.util.Date;
import java.util.List;

/**
 * Model Entity for Project
 * 
 * Created by Sharad
 */

public class Project {

	private long id;

	private String name;

	private String description;

	private String summary;

	private boolean isCritical;

	private int estimates;

	/*
	 * @Temporal(TemporalType.TIMESTAMP) private Date dateRequested;
	 * 
	 * @Temporal(TemporalType.TIMESTAMP) private Date dateRequired;
	 * 
	 * @Enumerated(EnumType.STRING) private ProjectTypeMetadata typeMetadata;
	 * 
	 * 
	 * @OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE},
	 * orphanRemoval=true)
	 * 
	 * @JoinColumn(name="project_id") private List<Contact> contacts;
	 */

	public Project() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the isCritical
	 */
	public boolean isCritical() {
		return isCritical;
	}

	/**
	 * @param isCritical the isCritical to set
	 */
	public void setCritical(boolean isCritical) {
		this.isCritical = isCritical;
	}

	/**
	 * @return the contacts
	 */
	/*
	 * public List<Contact> getContacts() { return contacts; }
	 * 
	 *//**
		 * @param contacts the contacts to set
		 */
	/*
	 * public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
	 * 
	 *//**
		 * @return the typeMetadata
		 */
	/*
	 * public ProjectTypeMetadata getTypeMetadata() { return typeMetadata; }
	 * 
	 *//**
		 * @param typeMetadata the typeMetadata to set
		 */
	/*
	 * public void setTypeMetadata(ProjectTypeMetadata typeMetadata) {
	 * this.typeMetadata = typeMetadata; }
	 * 
	 *//**
		 * @return the estimates
		 */
	/*
	 * public int getEstimates() { return estimates; }
	 * 
	 *//**
		 * @param estimates the estimates to set
		 */
	/*
	 * public void setEstimates(int estimates) { this.estimates = estimates; }
	 * 
	 *//**
		 * @return the dateRequested
		 */
	/*
	 * public Date getDateRequested() { return dateRequested; }
	 * 
	 *//**
		 * @param dateRequested the dateRequested to set
		 */
	/*
	 * public void setDateRequested(Date dateRequested) { this.dateRequested =
	 * dateRequested; }
	 * 
	 *//**
		 * @return the dateRequired
		 */
	/*
	 * public Date getDateRequired() { return dateRequired; }
	 * 
	 *//**
		 * @param dateRequired the dateRequired to set
		 *//*
			 * public void setDateRequired(Date dateRequired) { this.dateRequired =
			 * dateRequired; }
			 * 
			 */
}
