package org.dudelorf.binary_clock;

import java.util.TimerTask;

public class ClockTick extends TimerTask {

	@Override
	public void run() {
		System.out.println("tick");
		
	}

}
