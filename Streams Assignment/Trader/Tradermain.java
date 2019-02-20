package com.Trader;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tradermain {

	public static void main(String args[]) {
		
		List<Trader> list=new ArrayList<>();
		list.add(new Trader("Saikumar","Hyderabad"));
		list.add(new Trader("Amarnath","Lingampally"));
		list.add(new Trader("Meharaj","Nalgonda"));
		list.add(new Trader("Suresh","Bangalore"));
		list.add(new Trader("Krishna","Pune"));
		list.add(new Trader("Krish","Pune"));
		list.add(new Trader("Pash","Indore"));
		
		
		System.out.println("Unique Cities where traders work:\n");
		list.stream().map(Trader::getCity).distinct().forEach(System.out::println);
		System.out.println("*****************************");
		
	    System.out.println("Traders from Pune and sorted them by name :\n");
	    		list.stream().filter(p->p.getCity()=="PUNE")
	    		.sorted(Comparator.comparing(Trader::getName))
	    		.collect(Collectors.toList()).forEach(System.out::println);
	    		
	    		System.out.println("*****************************");
	    		
	    		 System.out.println("Traders names sorted alphabetically :\n");
	    		 Stream<String> list2=list.stream().sorted(Comparator.comparing(Trader::getName)).map(Trader::getName);
	    				 list2.forEach(System.out::println);
	    				 
	    				 System.out.println("*****************************");
	    				 
	    				 System.out.println("Traders based in Indore :\n");
	    				 Stream<String> list3=list.stream().filter(p->p.getCity()=="Indore").map(Trader::getName);
	    				 list3.forEach(System.out::println);
	}

}