public class Driver {
    public static void main(String[] args) {

        String[] passwords = {
            "abc",
            "Abcd1234!",
            "abcdef12",
            "Abcdefgh"
        };

        for (String pw : passwords) {
            PasswordChecker.checkRules(pw);
            System.out.println();
        }
    }
}