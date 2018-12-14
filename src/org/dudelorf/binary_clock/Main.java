package org.dudelorf.binary_clock;

import java.util.Timer;

public class Main {

	public static void main(String[] args) {
		Clock clock = new Clock(new Timer());
		clock.start(new ClockTick());
	}

}
