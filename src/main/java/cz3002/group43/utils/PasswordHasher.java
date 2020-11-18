package cz3002.group43.utils;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import cz3002.group43.actions.LoginAction;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordHasher {
    private static final Logger LOG = LoggerFactory.getLogger(LoginAction.class);

    public static String hashString(String input)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            // calculate message digest of the input string
            byte[] messageDigest = md.digest(input.getBytes());
            LOG.debug(Base64.getEncoder().encodeToString(messageDigest));

            return Base64.getEncoder().encodeToString(messageDigest);
        }

        // If the algorithm is not supported throw an error
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
