/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**
 *
 * @author Giridhar
 */
public class ValidateMail {
    Session newSession = null;
	MimeMessage mimeMessage = null;
        public void preparetoSendEmail(String emailSubject, String emailBody, String receipent) throws MessagingException, AddressException, IOException{
                setupServerProperties();
		mimeMessage = draftEmail(emailSubject,emailBody,receipent);
		sendEmail();
        }
        


        private void setupServerProperties() {
		Properties properties = System.getProperties();
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host", "smtp.gmail.com");
		newSession = Session.getDefaultInstance(properties,null);
	}
        
	private void sendEmail() throws MessagingException {
		String fromUser = "divyasree79723@gmail.com";  //Enter sender email id
		String fromUserPassword = "kziwmqhrdfgzjvou";  //Enter sender gmail password , this will be authenticated by gmail smtp server
		String emailHost = "smtp.gmail.com"; 
		Transport transport = newSession.getTransport("smtp");
		transport.connect(emailHost, fromUser, fromUserPassword);
		transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
		transport.close();
		System.out.println("Email successfully sent!!!");
	}
        
        
//       
//                
//                
//	
        public void sendAttachment() {
		Properties properties = System.getProperties();
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.smtp.host", "smtp.gmail.com");
                System.out.println("Before new session");
		newSession = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
                   
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("divyasree79723@gmail.com","kziwmqhrdfgzjvou");
                }
                
                });
                 System.out.println("After new session");
                try {
                    
                    Message message = new MimeMessage(newSession);
                    message.setFrom(new InternetAddress("divyasree79723@gmail.com"));//ur email
                    message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("vaishnavi.asv@gmail.com"));//u will send to
                    message.setSubject("Subject");    
                    message.setText("Attachment Inside");
                    MimeBodyPart messageBodyPart = new MimeBodyPart();
                    Multipart multipart = new MimeMultipart();


     
     
                    String file = "//Users//srivaishnaviaekkati//Downloads//model_diag.jpeg";
                    String fileName = "Hello";
                    messageBodyPart = new MimeBodyPart();   
                    DataSource source = new FileDataSource(file);      
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(fileName);
                    multipart.addBodyPart(messageBodyPart);
                    message.setContent(multipart);

       
                    System.out.println("sending");
                    Transport.send(message);
                    
                    System.out.println("Done");
        
   

                    }catch (MessagingException e) {
                        e.printStackTrace();
                    }
        }

	private MimeMessage draftEmail(String emailSubject, String emailBody, String receipent) throws AddressException, MessagingException, IOException {
            ArrayList<String> emailReceipients = new ArrayList<>();
            emailReceipients.add(receipent);
		mimeMessage = new MimeMessage(newSession);
		
		for (String rec:emailReceipients)
		{
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(rec));
		}
		mimeMessage.setSubject(emailSubject);
                mimeMessage.setContent(emailBody, "text/html");
	   
     
		 return mimeMessage;
	}
}
