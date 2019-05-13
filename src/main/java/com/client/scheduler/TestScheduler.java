package com.client.scheduler;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {
	
	static final Logger logger = LoggerFactory.getLogger(TestScheduler.class);

	@Scheduled(cron = "0/5 * * * * *")
    public void run() {
		logger.info("test info");
		logger.debug("test debug");
		logger.error("test error");
		System.out.println("test");
		
        //log.info("hello2----");
    }
}
