package com.ms.email.dtos;


import org.springframework.beans.BeanUtils;
import com.ms.email.models.EmailModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/*
 * @NotBlank pois todas as informações são obrigatórias na hora de fazer o post.
 * @Email já verifica se os emails são válidos.
 */

public class EmailDto {
  
  /*
   * Getter e Setters
   */
  
  public String getOwnerRef() {
    return ownerRef;
  }


  public void setOwnerRef(String ownerRef) {
    this.ownerRef = ownerRef;
  }


  public String getEmailFrom() {
    return emailFrom;
  }


  public void setEmailFrom(String emailFrom) {
    this.emailFrom = emailFrom;
  }


  public String getEmailTo() {
    return emailTo;
  }


  public void setEmailTo(String emailTo) {
    this.emailTo = emailTo;
  }


  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @NotBlank
  private String ownerRef;
  @NotBlank
  @Email
  private String emailFrom;
  @NotBlank
  @Email
  private String emailTo;
  @NotBlank
  private String subject;
  @NotBlank
  private String text;
  
  
  public EmailModel convertToEmailModel(){
    var emailModel = new EmailModel();
    BeanUtils.copyProperties(this, emailModel);
    return emailModel;
}

}
