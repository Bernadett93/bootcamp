package org.marketing.newsletter;

import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.service.SubscriptionService;
import org.marketing.newsletter.service.exception.SubscriptionAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriptionValidationTests {

  @Autowired
  private SubscriptionService service;
  
	@Test(expected=ConstraintViolationException.class) // validációs keretrendszer dobja
	public void test_registrationWithNullSubscription_fails() throws SubscriptionAlreadyExistsException {
	  service.register(null);
	}
	
	@Test(expected=ConstraintViolationException.class)
  public void test_registrationWithNameOfSpaceOnly_fails() throws SubscriptionAlreadyExistsException {
    service.register(new Subscription(" ", "emily@mail.com"));
  }
	
	@Test(expected=ConstraintViolationException.class)
  public void test_registrationWithInvalidEmailAddress_fails() throws SubscriptionAlreadyExistsException {
    service.register(new Subscription("Emily Blunt", "mail.com"));
  }
	

}
