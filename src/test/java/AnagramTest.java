import org.junit.Test;

public class AnagramTest {

    @Test
    public void canAnagram(){
        String[] firstWords = {"cinema", "host", "aba", "train"};
        String[] secondWords = {"iceman", "shot", "bab", "rain" };

         Anagram.solution(firstWords, secondWords);

    }
}
