package com.ajit.generalization;


class Father { 
	public void work() 
	{ 
		System.out.println("Earning Father"); 
	} 
} 

class Son extends Father { 
	public void play() 
	{ 
		System.out.println("Enjoying son"); 
	} 
	
	@Override
	public void work() {
		System.out.println("Father Overiddon by son works");
	}
} 

class Main { 
	public static void main(String[] args) 
	{ 

		try { 
			// son is a sub class reference 
			Son son; 

			// new operator returns a superclass reference 
			// which is narrowed using casting 
			// and stored in son variable 

			// This will throw exception 
			son = new Son(); 

			// Through a narrowed reference of the superclass 
			// we can neither access superclass method 
			// and nor the subclass methods 

			// Below lines will show 
			// an error when uncommented 
			 son.work(); 
			 son.play(); 
		} 
		catch (Exception e) { 
			System.out.println(e); 
		} 
	} 
} 

