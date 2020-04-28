package com.moukafih.java.model;

public class Contestant implements Comparable<Contestant>{
	
	private String tagNumber;
	private TimeDuration resultTime;
	
	public Contestant(String tagNumber, TimeDuration resultTime) {
		super();
		this.tagNumber = tagNumber;
		this.resultTime = resultTime;
	}

	public String getTagNumber() {
		return tagNumber;
	}

	public void setTagNumber(String tagNumber) {
		this.tagNumber = tagNumber;
	}

	public TimeDuration getResultTime() {
		return resultTime;
	}

	public void setResultTime(TimeDuration resultTime) {
		this.resultTime = resultTime;
	}

	@Override
	public int compareTo(Contestant o) {
		// TODO Auto-generated method stub
		return this.resultTime.getSecond() - o.resultTime.getSecond();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tagNumber +" : "+resultTime.toString();
	}
	
		
}