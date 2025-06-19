package MemoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Main { 

	public static void main(String[] args) throws Exception { 
  	  List users = new ArrayList<>(); 
  	  for (int i = 0; i < 250000000; i++) { 
  		  users.add(new User("user-" + i, "address-" + i)); 
  	  } 
  	  System.out.println("Created " + users.size()/1000000 + "M users."); 
	} 
} 
class User { 
	String name; 
	String address; 

	public User(String _name, String _address){ 
  	  name = _name; 
  	  address = _address; 
	} 
} 
