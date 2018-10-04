package org.marketing.newsletter.repository.impl;

import java.util.List;

import org.marketing.newsletter.model.Newsletter;
import org.marketing.newsletter.repository.NewsletterRepository;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

@Repository
@ConfigurationProperties(prefix="communication")
public class ConfigurationBasedNewsletterRepositoryImpl implements NewsletterRepository {
  
  private List<Newsletter> recentNewsletters;
  
  @Override
  public List<Newsletter> getRecentNewsletters() {
    return recentNewsletters;
  }

  public void setRecentNewsletters(List<Newsletter> recentNewsletters) {
    this.recentNewsletters = recentNewsletters;
  }
  
  

}
