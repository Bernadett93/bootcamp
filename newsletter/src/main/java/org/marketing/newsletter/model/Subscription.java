
package org.marketing.newsletter.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Subscription {
  
  @NotBlank 
  @Size(min=3, max=30)
  private String fullName;
  
  @NotBlank
  @Email
  private String emailAddress;
  
  public Subscription()
  {
    
  }
  
  public Subscription(String fullName, String emailAddress) {
    this.fullName = fullName;
    this.emailAddress = emailAddress;
  }
  
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
  public String getEmailAddress() { 
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  @Override
  public String toString() {
    return "Subscription [fullName=" + this.fullName + ", emailAddress=" + this.emailAddress + "]";
  }
  
  
}
