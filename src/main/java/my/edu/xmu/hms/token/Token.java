package my.edu.xmu.hms.token;

import java.security.SecureRandom;
import java.util.Base64;

public class Token {
    String token;

    private static final SecureRandom secureRandom = new SecureRandom(); //for thread safety
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //for thread safety

    public Token(String identifier) {
        this.token = generateNewToken(identifier);
    }

    public static String generateNewToken(String identifier) {
        byte[] randomBytes = new byte[24];
        secureRandom.nextBytes(randomBytes);
        String random = base64Encoder.encodeToString(randomBytes);
        return identifier + random.substring(3);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token='" + token + '\'' +
                '}';
    }
}
