import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
public class AuthService {
    private final Map<String, String> users = new HashMap<>();
    public static String hash(String text) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(text.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    public void register(String user, String password) throws Exception {
        users.put(user, hash(password));
    }
    public boolean login(String user, String password) throws Exception {
        return users.containsKey(user) && users.get(user).equals(hash(password));
    }
}
