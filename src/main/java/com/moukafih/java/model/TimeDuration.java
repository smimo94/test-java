package com.moukafih.java.model;

import com.moukafih.java.exception.BadBadValueException;

//Helper class to store result
class Convert{
	
	static int sec;
	static int min;
	static int hour;
	
	public Convert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

public class TimeDuration {
	
	private int second;

	public TimeDuration(int second) {
		
		if(second<0)
		throw new BadBadValueException("Negative value");
		
		this.second = second;

	}
	
	public String convert() {
		
		String result = "";
		
		Convert.sec = this.second % 60;
		Convert.hour = this.second / 60;
		Convert.min = Convert.hour % 60;
		Convert.hour = Convert.hour / 60;
		
		if(Convert.hour!=0) {
			result +=Convert.hour+"h ";
		}
		if(Convert.min!=0) {
			result +=Convert.min+"m ";		
		}else {
			if(Convert.hour!=0)
			result +=Convert.min+"m ";	
		}
		result += Convert.sec+"s";
		
		
		return result;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return Convert.hour+"h "+Convert.min+"m "+Convert.sec+"s";
		return convert();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	
	
	

}
