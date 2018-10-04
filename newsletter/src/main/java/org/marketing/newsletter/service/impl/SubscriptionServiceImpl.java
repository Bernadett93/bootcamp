package org.marketing.newsletter.service.impl;

import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.repository.SubscriptionRepository;
import org.marketing.newsletter.service.SubscriptionService;
import org.marketing.newsletter.service.exception.SubscriptionAlreadyExistsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

  private Logger logger=LoggerFactory.getLogger(getClass());
  @Autowired
  private SubscriptionRepository repository;
  
  @Override
  public void register(Subscription subscription) throws SubscriptionAlreadyExistsException {
   
    Assert.notNull(subscription, "subscription must not be null");
    
    logger.info("Registering subscription: {}", subscription);
    
    try {
      repository.save(subscription);  
    }catch(RuntimeException duplicate) {  //FIXME: add proper Exception type
      
      logger.error("Error during persisting the subscription", duplicate);
      throw new SubscriptionAlreadyExistsException("Subscription already exists with email: "+subscription.getEmailAddress());
    }
    
  }

}
