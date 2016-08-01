package com.niitconnect.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="blog")
public class Blog {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int blog_id;
	 @NotEmpty(message="name Should not be empty")
	private String name;
	 @Size(min=5, message="Title must be atleast 5 characters")
	private String title;
	 @Size(min=20, message="description must be atleast 5 characters")
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
