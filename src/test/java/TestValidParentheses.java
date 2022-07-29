import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidParentheses {

    @Test
    void testValidParentheses() {
        Assertions.assertEquals(true,ValidParentheses.validParentheses( "()" ));
        Assertions.assertEquals(false,ValidParentheses.validParentheses( "())" ));
        Assertions.assertEquals(true,ValidParentheses.validParentheses( "32423(sgsdg)" ));
        Assertions.assertEquals(false,ValidParentheses.validParentheses( "(dsgdsg))2432" ));
        Assertions.assertEquals(true,ValidParentheses.validParentheses( "adasdasfa" ));    }

}
