package com.al;

import java.util.function.Function;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringcloudM3TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM3TaskApplication.class, args);
	}

	@Bean
	public TollProcessingTask runTask() {
		return new TollProcessingTask();
	}

	public class TollProcessingTask implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			if (null != args) {
				String stationId = args[0];
				String licensePlate = args[1];
				String timeStamp = args[2];
				System.out.println(String.format("stationId = %s %nlicensePlate = %s %ntimeStamp = %s %n", stationId,
						licensePlate, timeStamp));
			}
		}
	}
}
