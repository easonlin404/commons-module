package com.tradevan;

import org.junit.Test;

public class ServiceTset {
	
	@Test
	void doAdd(){
		
		Add add = new Add() {
			@Override
			public int process() {
				return 0;
			}
		};
		
		add.query(null);
	}
}
