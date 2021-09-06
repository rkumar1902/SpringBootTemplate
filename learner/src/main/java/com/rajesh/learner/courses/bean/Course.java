/**
 * 
 */
package com.rajesh.learner.courses.bean;

/**
 * @author rkumar4
 *
 */
public class Course {
	
	long id;
	
	String subject;
	
	String description;


	/**
	 * @param id
	 * @param subject
	 * @param description
	 */
	public Course(long id, String subject, String description) {
		super();
		this.id = id;
		this.subject = subject;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
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

	@Override
	public String toString() {
		return "Course [id=" + id + ", subject=" + subject + ", description=" + description + "]";
	}
	
}
