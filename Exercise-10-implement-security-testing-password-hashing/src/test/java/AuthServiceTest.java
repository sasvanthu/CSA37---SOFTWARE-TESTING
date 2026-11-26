import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AuthServiceTest {
    private AuthService auth;
    @BeforeEach void setUp() throws Exception {
        auth = new AuthService();
        auth.register("student", "Secret@123");
    }
    @Test void hashIsRepeatable() throws Exception {
        assertEquals(AuthService.hash("Secret@123"), AuthService.hash("Secret@123"));
    }
    @Test void hashIsDifferentFromPlainPassword() throws Exception {
        assertNotEquals("Secret@123", AuthService.hash("Secret@123"));
    }
    @Test void hashHas64HexCharacters() throws Exception {
        assertEquals(64, AuthService.hash("Secret@123").length());
    }
    @Test void loginWithCorrectPassword() throws Exception {
        assertTrue(auth.login("student", "Secret@123"));
    }
    @Test void loginWithWrongPassword() throws Exception {
        assertFalse(auth.login("student", "secret@123"));
    }
}
