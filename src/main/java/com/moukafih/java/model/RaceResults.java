package com.moukafih.java.model;

import java.util.Set;
import java.util.TreeSet;

public class RaceResults {
	
	Set<Contestant> contestants;
	
	
	
	public RaceResults(Set<Contestant> contestants) {
		super();
		this.contestants = contestants;
	}



	public void oneNewResult(String tagNumber, TimeDuration resultTime) {
		
		Contestant c = new Contestant(tagNumber,resultTime);
		contestants.add(c);
		
	}
	
	public void printResults() {
		
		System.out.println(this.contestants);
		
	}

}
