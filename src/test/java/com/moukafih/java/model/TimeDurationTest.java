package com.moukafih.java.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeDurationTest {

	@Test
	void testToString1() {
		String expected = "0s";
		TimeDuration t = new TimeDuration(0);
		assertEquals(expected, t.toString());
	}
	
	@Test
	void testToString2() {
		String expected = "12m 12s";
		TimeDuration t = new TimeDuration(732);
		assertEquals(expected, t.toString());
	}

}
