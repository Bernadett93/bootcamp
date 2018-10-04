package org.marketing.newsletter.controller;

import org.marketing.newsletter.repository.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfirmationController {
  
  @Value("${subscription.numberOfNewsletterSubscriptions}")
  private long numberOfNewsletterSubscriptions;
  
  @Autowired
  private NewsletterRepository newsletterRepository;
  
  @GetMapping("/thank-you")
  public String getConfirmation(Model model)
  {
    model.addAttribute("numberOfNewsletterSubscriptions", numberOfNewsletterSubscriptions);
    model.addAttribute("newsletterHighlights", newsletterRepository.getRecentNewsletters());
    return "confirmation";
  }
}
