package org.marketing.newsletter.repository;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.marketing.newsletter.model.Subscription;
import org.springframework.validation.annotation.Validated;

@Validated
public interface SubscriptionRepository {
  
  void save(@NotNull @Valid Subscription subscription);
}
