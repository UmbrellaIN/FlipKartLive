package com.umbrella.FlipKartLive.FunctionalTest;



import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.umbrella.FlipKartLive.generics.LoggerHelper;
import com.umbrella.FlipKartLive.testCore.Config;
import com.umbrella.FlipKartLive.testCore.TestBase;

public class VerifyYouTubeFunctionality extends TestBase {

	Config config;

	private static final Logger log = LoggerHelper.getLogger(VerifyYouTubeFunctionality.class);

	@Test
	public void SkipAddTest() throws InterruptedException
	{
		log.info(VerifyYouTubeFunctionality.class.getName() + " Method verifyYouTube " + " Get Started");
		config = new Config(OR);
		driver.get(config.getWebsite());
		log.info("++++++++++++++++++++++Just Checking Project Config++++++++++++++++++++++++++++++++++++++");
		log.info("++++++++++++++++++++++Just Checking Project Config++++++++++++++++++++++++++++++++++++++");

	}

}
