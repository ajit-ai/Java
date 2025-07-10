package captcha;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Represents the data for a single CAPTCHA instance.
 * Storing the CAPTCHA as an object allows us to attach metadata like a creation timestamp.
 */
class Captcha {
    final String code; // The expected answer
    final String question; // The question presented to the user (can be the code itself or a math problem)
    final Instant createdAt;

    public Captcha(String code, String question) {
        this.code = code;
        this.question = question;
        this.createdAt = Instant.now();
    }
}

/**
 * A service to manage the lifecycle of CAPTCHAs.
 * This demonstrates several advanced ways to handle and validate CAPTCHA data.
 */
class AdvancedCaptchaService {

    // Way 3: Server-Side State Management (In-memory cache)
    // In a real web app, this could be a distributed cache (like Redis) or part of the user's HTTP session.
    // We use a ConcurrentHashMap for thread safety. The key is a unique identifier for a user/session.
    private final Map<String, Captcha> captchaStore = new ConcurrentHashMap<>();
    private static final Duration EXPIRATION_TIME = Duration.ofMinutes(2);

    // Way 1: Secure & Configurable Generation
    // Use SecureRandom for cryptographically strong randomness, which is essential for security.
    // The character set omits visually confusing characters (e.g., '0' vs 'O', '1' vs 'l').
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();
    private static final String ALPHANUMERIC_CHARS = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";

    /**
     * Generates a standard alphanumeric CAPTCHA.
     * @param sessionId A unique identifier for the user's session.
     * @return The generated Captcha object.
     */
    public Captcha generateAlphanumericCaptcha(String sessionId) {
        int length = 6;
        StringBuilder captchaCode = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            captchaCode.append(ALPHANUMERIC_CHARS.charAt(SECURE_RANDOM.nextInt(ALPHANUMERIC_CHARS.length())));
        }
        String code = captchaCode.toString();
        Captcha captcha = new Captcha(code, "Enter the following code: " + code);
        captchaStore.put(sessionId, captcha);
        return captcha;
    }

    // Way 2: Alternative CAPTCHA Type (Math Problem)
    // This provides a different kind of challenge to the user.
    public Captcha generateMathCaptcha(String sessionId) {
        int num1 = SECURE_RANDOM.nextInt(10) + 1; // 1-10
        int num2 = SECURE_RANDOM.nextInt(10) + 1; // 1-10
        String question = String.format("What is %d + %d?", num1, num2);
        String code = String.valueOf(num1 + num2);

        Captcha captcha = new Captcha(code, question);
        captchaStore.put(sessionId, captcha);
        return captcha;
    }

    /**
     * Validates the user's input against the stored CAPTCHA.
     * @param sessionId The user's session identifier.
     * @param userInput The input provided by the user.
     * @return true if valid, false otherwise.
     */
    public boolean validateCaptcha(String sessionId, String userInput) {
        // Way 5: One-Time-Use Validation
        // We remove the CAPTCHA immediately to ensure it can only be attempted once.
        // This prevents replay attacks or multiple guesses on the same CAPTCHA.
        Captcha captcha = captchaStore.remove(sessionId);

        if (captcha == null) {
            System.out.println("Validation failed: No CAPTCHA found for this session or it was already used.");
            return false;
        }

        // Way 4: Time-Limited Validation
        // Check if the CAPTCHA was created within the allowed time window.
        if (Duration.between(captcha.createdAt, Instant.now()).compareTo(EXPIRATION_TIME) > 0) {
            System.out.println("Validation failed: CAPTCHA has expired.");
            return false;
        }

        // The actual comparison, made case-insensitive for user-friendliness.
        boolean isValid = captcha.code.equalsIgnoreCase(userInput);
        if (!isValid) {
            System.out.println("Validation failed: Incorrect code.");
        }
        return isValid;
    }
}

public class AdvancedCaptchaDemo {
    public static void main(String[] args) {
        AdvancedCaptchaService captchaService = new AdvancedCaptchaService();
        Scanner scanner = new Scanner(System.in);
        String userSessionId = "user123"; // In a real app, this would be a real session ID.

        System.out.println("--- DEMO: Mathematical CAPTCHA ---");
        Captcha mathCaptcha = captchaService.generateMathCaptcha(userSessionId);
        System.out.println("CAPTCHA Challenge: " + mathCaptcha.question);
        System.out.print("Your answer: ");
        String userInput = scanner.nextLine();

        if (captchaService.validateCaptcha(userSessionId, userInput)) {
            System.out.println("SUCCESS: CAPTCHA verification successful!");
        } else {
            System.out.println("FAILURE: CAPT