package com.aurionpro.command.test;

import com.aurionpro.command.model.ICommand;
import com.aurionpro.command.model.OffCommand;
import com.aurionpro.command.model.OnCommand;
import com.aurionpro.command.model.RemoteControl;
import com.aurionpro.command.model.Television;

public class TvTest {
	public static void main(String[] args) {
		Television tv = new Television();
		
		ICommand onCommand = new OnCommand(tv);
		ICommand offCommand = new OffCommand(tv);
		
		RemoteControl remote = new RemoteControl(onCommand);
		remote.pressButton();
		
		remote.setCommand(offCommand);
		remote.pressButton();
	}
}