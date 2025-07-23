package com.ajit.demo;

import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String args[]) {
		Map<String,String> maps = new HashMap<>();
		maps.put("A", "Ajit");
		maps.put("B","Harsh");
		System.out.println("Map Value: " + maps);
	}
}