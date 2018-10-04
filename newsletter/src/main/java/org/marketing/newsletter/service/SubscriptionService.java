package org.marketing.newsletter.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.service.exception.SubscriptionAlreadyExistsException;
import org.springframework.validation.annotation.Validated;

@Validated
public interface SubscriptionService {
    void register (@NotNull @Valid Subscription subscription) throws SubscriptionAlreadyExistsException;
}
