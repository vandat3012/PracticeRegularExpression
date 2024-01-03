public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"adf@gmail.com","A@gmail.com"};
    public static final String[] inValidEmail = new String[] {"@adf@gmail.com","A@gmail."};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : inValidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
