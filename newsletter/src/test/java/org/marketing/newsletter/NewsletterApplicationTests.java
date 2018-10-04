package org.marketing.newsletter;

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
public class NewsletterApplicationTests {

  @Autowired
  private SubscriptionService service;
  
	@Test
	public void test_registrationWithValidSubscription_successful() throws SubscriptionAlreadyExistsException {
	  service.register(new Subscription("Emily Blunt", "emily@mail.com"));
	}

}
