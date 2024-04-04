import org.example.UserRegistationFormClass;
import org.junit.jupiter.api.Test;

public class UserRegistationFormClassTest {

    @Test
    public void testIsAgeValid() {
        UserRegistationFormClass userRegistationFormClass = new UserRegistationFormClass();
        boolean result = userRegistationFormClass.isAgeValid(20);
        org.junit.jupiter.api.Assertions.assertEquals(true, result);
    }
}
