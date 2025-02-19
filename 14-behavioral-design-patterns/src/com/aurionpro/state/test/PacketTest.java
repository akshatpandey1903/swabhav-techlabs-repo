package com.aurionpro.state.test;

import com.aurionpro.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		
		Packet packet = new Packet();
		packet.getCurrentState();
		packet.goToNextState();
		packet.getCurrentState();
		packet.goToNextState();
		packet.getCurrentState();
		packet.goToPrevState();
		packet.getCurrentState();
		packet.goToNextState();
		packet.getCurrentState();
		packet.goToNextState();
		packet.getCurrentState();
		
	}
}
