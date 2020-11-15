package cz3002.group43.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordHasher {
    public static String hashString(String input)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            // calculate message digest of the input string
            byte[] messageDigest = md.digest(input.getBytes());

            return Base64.getEncoder().encodeToString(messageDigest);
        }

        // If the algorithm is not supported throw an error
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
