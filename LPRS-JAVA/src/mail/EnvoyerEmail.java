package mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnvoyerEmail {
private static String user = "boykaverif@gmail.com";
private static  String password = "Lyana93270";

public static void  envoyer(String mail, String texte) throws MessagingException {

Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable","true");
props.put("mail.smtp.host","smtp.gmail.com");
props.put("mail.smtp.port","587");

Session session = Session.getInstance(props, new javax.mail.Authenticator() {
protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
return new javax.mail.PasswordAuthentication(user, password);
}
});
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("boykaverif@gmail.com"));
message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail));
message.setSubject("Inscription");
message.setText(texte);

Transport.send(message) ;

System.out.println("Votre messge a été envoyer avec succés");
}
}