package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Starter implements InitializingBean {

	@Autowired
	private RuntimeService runtimeService;
	
	private static final Logger log = LoggerFactory.getLogger(Starter.class);

	public void afterPropertiesSet() throws Exception {
		log.info("AfterPropertiesSet Invoked!!!!");
		System.out.println("AfterPropertiesSet Invoked!!!!");
		runtimeService.startProcessInstanceByKey("loanApproval");
	}

	public void setRuntimeService(RuntimeService runtimeService) {
		log.info("setRuntimeService Invoked!!!!");
		System.out.println("setRuntimeService Invoked!!!!");
		this.runtimeService = runtimeService;
	}
}