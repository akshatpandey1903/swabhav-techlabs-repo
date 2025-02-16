package com.aurionpro.model;

public class BoxWeight extends Box{
	private double weight;
	
	public BoxWeight(double width, double height, double depth, double weight){
		super(width, height, depth);
		this.weight = weight;
	}
	

	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + "] Depth" + getDepth();
	}
	
	
}
