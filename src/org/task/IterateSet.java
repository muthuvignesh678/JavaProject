package org.task;

import java.util.HashSet;
import java.util.Set;

public class IterateSet {
public static void main(String[] args) {
	Set <Object> set=new HashSet<>();
	
	
	set.add("vignesh");
	set.add("java");
	set.add("123");
	set.add(null);
	set.add("vignesh");
	
	for ( Object a: set) {
		
		System.out.println(a);
	}
	
	
}
}
