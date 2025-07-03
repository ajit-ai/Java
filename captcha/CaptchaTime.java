package captcha;


import java.util.Random;
import java.util.Scanner;

public class CaptchaTime {
    private String captchaCode;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 6;

    // Generate a random CAPTCHA code
    public void generateCaptcha() {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        captchaCode = code.toString();
    }

    // Get the CAPTCHA code
    public String getCaptchaCode() {
        return captchaCode;
    }

    // Verify user input against the CAPTCHA code
    public boolean verifyCaptcha(String userInput) {
        return captchaCode != null && captchaCode.equalsIgnoreCase(userInput);
    }

    // Main method for testing (console-based)
    public static void main(String[] args) {
        CaptchaTime captcha = new CaptchaTime();
        Scanner scanner = new Scanner(System.in);

        // Generate and display CAPTCHA
        captcha.generateCaptcha();
        System.out.println("CAPTCHA Code: " + captcha.getCaptchaCode());

        // Prompt user for input
        System.out.print("Enter the CAPTCHA code: ");
        String userInput = scanner.nextLine();

        // Verify input
        if (captcha.verifyCaptcha(userInput)) {
            System.out.println("CAPTCHA verification successful!");
        } else {
            System.out.println("CAPTCHA verification failed. Try again.");
        }

        scanner.close();
    }
}