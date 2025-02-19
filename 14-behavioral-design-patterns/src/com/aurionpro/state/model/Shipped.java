package com.aurionpro.state.model;

public class Shipped implements IPacketState{

	
	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is now set to Delivered");
		packet.setPacketState(new Delivered());
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet has been Shipped");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.setPacketState(new Ordered());
		System.out.println("State set to Ordered");
	}
	
}
