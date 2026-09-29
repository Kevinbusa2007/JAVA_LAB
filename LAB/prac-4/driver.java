public class driver {

    public static void main(String[] args) {

        pass p = new pass();

        String[] password = {
            "abc",
            "Abcd1234!",
            "hello123",
            "ABC"
        };

        for (int i = 0; i < password.length; i++) {

            System.out.println("Password : " + password[i]);

            int result = p.check(password[i]);

            System.out.println("Rules Passed : " + result);

            // System.out.println("Strength : " + p.strength(password[i]));

            System.out.println("----------------");
        }
    }
}