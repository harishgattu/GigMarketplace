package com.gigmarketplace;

public class Gig {

	    private int id;
	    private String title;
	    private String description;
	    private String location;
	    
	    String applicantName;
	    boolean applied;
	    

	    public Gig(int id, String title, String description, String location) {

	        this.id = id;
	        this.title = title;
	        this.description = description;
	        this.location = location;
	        this.applied = false;
	        this.applicantName = "";
	    }
	    
	    public int getId() {
	    	return id;
	    }
	    
	    public String getTitle() {
	    	return title;
	    }
	    
	    void displayGig() {
	    	System.out.println("----------------------------");
	        System.out.println("Gig ID: " + id);
	        System.out.println("Title: " + title);
	        System.out.println("Description: " + description);
	        System.out.println("Location: " + location);
	        System.out.println("------------------------------");
	    }
	    
	    
	    void displayAppliedGig() {
	    	System.out.println("----------------------------");
	        System.out.println("Gig ID: " + id);
	        System.out.println("Title: " + title);
	        System.out.println("Description: " + description);
	        System.out.println("Applied Name: " + applicantName); 
	        System.out.println("Application Status: Applied");
	        System.out.println("----------------------------");
	    }
}