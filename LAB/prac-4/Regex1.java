
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex1{
    public static void main(String args[])
    {
        String email = "kevin697@gmail.com";

        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@gmail\\.com$");
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches())
        {
            System.err.println("Valid email");
        }
        else
        {
            System.err.println("Invalid email");
        }
        // method-2
        String email1 = "kevin697gmail.com";
        if(email1.matches("^[A-Za-z0-9._%+-]+@gmail\\.com$"))
        {
            System.err.println("Valid email");
        }
        else
        {
            System.err.println("Invalid email");
        }
    }
}