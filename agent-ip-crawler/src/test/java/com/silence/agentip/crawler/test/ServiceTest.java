package com.silence.agentip.crawler.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.silence.agentip.crawler.service.impl.IpDataService;
import com.silence.agentip.dao.domain.IpDataDomain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/agentip-crawler-spring.xml" })
public class ServiceTest extends TestCase {
	@Autowired
	private IpDataService ipDataService;

	@Test
	public void addOneIpDataTest() {
		System.out.println(ipDataService);
		IpDataDomain ipDataDomain = new IpDataDomain();
		ipDataDomain.setIp("192.168.1.1");
	}
}
