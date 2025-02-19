package com.aurionpro.state.model;

public class Delivered implements IPacketState{
	
	
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet has already been delivered");
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet has been Delivered");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("State set to Shipped");
		packet.setPacketState(new Shipped());
	}
	
}
