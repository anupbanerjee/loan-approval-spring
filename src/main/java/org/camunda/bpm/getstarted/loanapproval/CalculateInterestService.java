package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculateInterestService implements JavaDelegate {

	private static final Logger log = LoggerFactory.getLogger(CalculateInterestService.class);

	public void execute(DelegateExecution delegate) throws Exception {

		log.info("CalculateInterestService execute method of Spring Bean invoked.");
		System.out.println("CalculateInterestService execute method of Spring Bean invoked.");

	}

}