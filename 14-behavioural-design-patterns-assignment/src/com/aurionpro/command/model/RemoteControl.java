package com.aurionpro.command.model;

public class RemoteControl {
	
	private ICommand command;
	
	public RemoteControl(ICommand command) {
		this.command = command;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
	
}
