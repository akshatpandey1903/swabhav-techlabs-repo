package com.aurionpro.state.model;

public class Packet {
	private IPacketState packetState;
	
	public IPacketState getPacketState() {
		return packetState;
	}

	public void setPacketState(IPacketState packetState) {
		this.packetState = packetState;
	}
	
	public Packet() {
		this.packetState = new Ordered();
	}
	
	public void goToNextState() {
		packetState.next(this);
	}
	
	public void goToPrevState() {
		packetState.previous(this);
	}
	
	public void getCurrentState() {
		packetState.current(this);
	}
	
}
