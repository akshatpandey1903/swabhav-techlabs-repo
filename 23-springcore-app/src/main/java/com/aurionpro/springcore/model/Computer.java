package com.aurionpro.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	@Value("Apple")
	private String name;
	
	@Autowired
	private Harddisk harddisk;
	
	public Computer(String name, Harddisk harddisk) {
		super();
		this.name = name;
		this.harddisk = harddisk;
	}
	public Computer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Harddisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}
	@Override
	public String toString() {
		return "Computer [name=" + name + ", harddisk=" + harddisk + "]";
	}
	
	
}
