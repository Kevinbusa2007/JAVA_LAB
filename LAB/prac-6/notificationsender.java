interface Notifier {
    void send(String message);
}

interface Urgent {
}

public class notificationsender {
    public static void main(String[] args) {

        Notifier email = message ->
                System.out.println("Email: " + message);

        Notifier sms = message ->
                System.out.println("SMS: " + message);

        Notifier[] senders = {email, sms};

        String message = "Your class starts at 10 AM";

        for (Notifier sender : senders) {
            sender.send(message);
        }

        System.out.println("Urgent Notifications:");

        for (Notifier sender : senders) {
            if (sender instanceof Urgent) {
                sender.send(message);
                sender.send(message);
            }
        }
    }
}