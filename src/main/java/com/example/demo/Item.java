package com.example.demo;

public class Item {

	
	private Integer id;
	private String description;
	private Boolean done;
	public Item(Integer id, String description, Boolean done) {
		super();
		this.id = id;
		this.description = description;
		this.done = done;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}
	
	
}
