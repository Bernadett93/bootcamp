package org.marketing.newsletter;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
  
  @PostConstruct
  public void hello()
  {
    System.out.println("Hello World!");
  }
}
