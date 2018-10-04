package org.marketing.newsletter.repository;

import java.util.List;

import org.marketing.newsletter.model.Newsletter;

public interface NewsletterRepository {
  List<Newsletter> getRecentNewsletters();
}
