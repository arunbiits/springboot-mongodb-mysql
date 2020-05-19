/**
 * 
 */
package io.arun.learning.springbootmongodbmysql.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author arun
 *
 */
@Document
public class Course {

	@Id
	private String id;
	private String name;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	public Course(String name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
}
