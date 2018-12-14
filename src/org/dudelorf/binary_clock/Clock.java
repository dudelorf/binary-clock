package org.dudelorf.binary_clock;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {

	protected Timer timer;
	
	public Clock(
		Timer timer
	) {
		this.timer = timer;
	}
	
	public void start(TimerTask task) {
		timer.schedule(task, 0, 1000L);
	}

}
