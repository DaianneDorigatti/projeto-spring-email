package com.ms.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import com.ms.email.enums.StatusEmail;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/*
 * @Data do Lombok pra não precisar gerar os getters, setters e contrutores manualmente.
 * columnDefinition = "TEXT", serve para conseguir colocar mais caracteres que uma string normal consegue.
 */

@Entity
@Table(name = "email")
public class EmailModel implements Serializable{
  private static final long serialVersionUID = 1L;  
    
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private UUID emailId;
  private String ownerRef;
  private String emailFrom;
  private String emailTo;
  private String subject;
  @Column(columnDefinition = "TEXT")
  private String text;
  private LocalDateTime sendDateEmail;
  private StatusEmail statusEmail;  

  /*
   * Construtor
   */

  public EmailModel(UUID emailId, String ownerRef, String emailFrom, String emailTo, String subject,
      String text, LocalDateTime sendDateEmail, StatusEmail statusEmail) {
    
    this.emailId = emailId;
    this.ownerRef = ownerRef;
    this.emailFrom = emailFrom;
    this.emailTo = emailTo;
    this.subject = subject;
    this.text = text;
    this.sendDateEmail = sendDateEmail;
    this.statusEmail = statusEmail;
  }
  
  /*
   * Construtor vazio
   */
  public EmailModel() {}
  
  
  public UUID getEmailId() {
    return emailId;
  }
  public void setEmailId(UUID emailId) {
    this.emailId = emailId;
  }
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
  public LocalDateTime getSendDateEmail() {
    return sendDateEmail;
  }
  public void setSendDateEmail(LocalDateTime sendDateEmail) {
    this.sendDateEmail = sendDateEmail;
  }
  public StatusEmail getStatusEmail() {
    return statusEmail;
  }
  public void setStatusEmail(StatusEmail statusEmail) {
    this.statusEmail = statusEmail;
  }
  public static long getSerialversionuid() {
    return serialVersionUID;
  } 

}
