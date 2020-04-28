package com.moukafih.java;



import java.util.Arrays;
import java.util.TreeSet;

import com.moukafih.java.model.Contestant;
import com.moukafih.java.model.RaceResults;
import com.moukafih.java.model.TimeDuration;

public class testJavaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RaceResults rs = new RaceResults(new TreeSet<Contestant>());
		
		rs.oneNewResult("tag1", new TimeDuration(7242)); //third
		rs.oneNewResult("tag2", new TimeDuration(5780)); //first
		rs.oneNewResult("tag3", new TimeDuration(6140)); //second
		
		rs.printResults();
		

	}

}
