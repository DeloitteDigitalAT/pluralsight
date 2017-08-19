package com.al;

import org.springframework.boot.CommandLineRunner;

public class TollProcessingTask implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		if (null != args) {
			String stationId = args[0];
			String licensePlate = args[1];
			String timeStamp = args[2];
			System.out.println(String.format("stationId = %s \nlicensePlate = %s \ntimeStamp = %s \n", stationId, licensePlate, timeStamp));
		}
	}
}