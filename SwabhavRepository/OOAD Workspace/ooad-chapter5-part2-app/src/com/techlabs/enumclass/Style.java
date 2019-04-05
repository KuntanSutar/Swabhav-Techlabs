package com.techlabs.enumclass;

public enum Style {
	ROCK, JAZZ;

	  public String toString() {
	    switch(this) {
	      case ROCK:  
	    	  return "Rock style";
	      case JAZZ:   
	    	  return "Jazz style";
	      default:  
	    	  return null;
	    }
	  }

}
