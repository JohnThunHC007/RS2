package it.milano.training.junit;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String name = null;
	private String pub = null;
	private String authors = null;
	
	
	Book(String name, String authors,String pub) {
		this.name=name;
		this.authors=authors;
		this.pub=pub;
		
	}

	

	public void setName(String name){
		this.name=name;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPub(String pub){
		this.pub=pub;
		
	}
	
	public String getPub() {
		return this.pub;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}
	
	
	public String getAuthors(){
		return this.authors;
	}
	
	
}
