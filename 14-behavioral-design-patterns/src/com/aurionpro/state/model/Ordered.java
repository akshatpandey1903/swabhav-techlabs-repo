package com.aurionpro.state.model;

public class Ordered implements IPacketState{
	

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is now set to Shipped");
		packet.setPacketState(new Shipped());
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet has been Ordered");
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet = null;
		System.out.println("Cancelled");
	}

}
