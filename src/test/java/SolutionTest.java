import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    @Test
    public void canGetTotal(){
        long[] numbers = {3, 6, 2, 9, -1, 10};
        String ans = Solution.solution(numbers);
        assertEquals("Left", ans);
    }

//    1, 4, 100, 5

    @Test
    public void canGetTotal2(){
        long[] numbers = { 1, 4, 100, 5};
        String ans = Solution.solution(numbers);
        assertEquals("Right", ans);
    }
}
