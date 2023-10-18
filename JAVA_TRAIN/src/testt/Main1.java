package testt;

// Define an interface for message sending
interface MessageSender {
    void sendMessage(String message, String recipient);
}



// Implement email sender using the interface
class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message, String recipient) {
        // Implement email sending logic here
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}



// Implement SMS sender using the interface
class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message, String recipient) {
        // Implement SMS sending logic here
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
}



// MessagingService can use any sender that implements MessageSender
class MessagingService {
    //MessagingService không phụ thuộc vào class implement. vì vậy có thể dễ dàng thay đổi class implement
    //Mà không ảnh hưởng đến MessagingService
    private MessageSender sender;



    public MessagingService(MessageSender sender) {
        this.sender = sender;
    }



    public void send(String message, String recipient) {
        sender.sendMessage(message, recipient);
    }
}


public class Main1 {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        //gọi class implemetation qua interface của nó


        MessagingService emailService = new MessagingService(emailSender);
        MessagingService smsService = new MessagingService(smsSender);



        emailService.send("Hello, this is an email!", "example@email.com");
        smsService.send("Hello, this is an SMS!", "+1234567890");
    }
}
