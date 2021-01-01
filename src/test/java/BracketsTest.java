import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketsTest {

    @Test
    public void missingOpen_invalid(){
        String input = ")(){}";

        boolean valid = Brackets.validate(input);
        assertFalse(valid);
    }

    @Test
    public void valid_three(){
        String input = "[]({})";

        boolean valid = Brackets.validate(input);
        assertTrue(valid);
    }

    @Test
    public void valid_two_simple(){
        String input = "({})";

        boolean valid = Brackets.validate(input);
        assertTrue(valid);
    }


    @Test
    public void valid_two_in_one(){
        String input = "{()[]}";

        boolean valid = Brackets.validate(input);
        assertTrue(valid);
    }

    @Test
    public void invalid_complex(){
        String input = "([)]";

        boolean valid = Brackets.validate(input);
        assertFalse(valid);
    }
}
