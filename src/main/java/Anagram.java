import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagram {
    public static void solution(String[] firstWords, String[] secondWords){

        for (int i =0; i < firstWords.length; i++){
            String answer = "1";

            String firstWord = firstWords[i];
            List<Character> firstWordChars = firstWord.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            Collections.sort(firstWordChars);

            String secondWord = secondWords[i];
            List<Character> secondWordChars = secondWord.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            Collections.sort(secondWordChars);

            if (secondWordChars.size() != firstWordChars.size()){
                answer = "0";
            }

            for (int j = 0; j < secondWordChars.size(); j++){
                char fwc = firstWordChars.get(j);
                char swc = secondWordChars.get(j);
                if (fwc != swc){
                    answer = "0";
                    break;
                }
            }
            System.out.println(answer);



        }

    }
}
