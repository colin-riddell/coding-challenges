import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Brackets {
    public static void solution(String[] inputLines) {
        for (String line :inputLines) {
            boolean result = validate(line);

            if (result) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }

    public static boolean validate(String input) {
        // convert to chars List<Character>
        List<Character> characters = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Stack<Character> counting = new Stack();
        ArrayList<Character> openingCharacters = new ArrayList<Character>(List.of('{', '(', '['));
        ArrayList<Character> closingCharacters = new ArrayList<Character>(List.of('}', ')', ']'));
        // loop over
        for (Character character : characters) {



//            if (characterIndex < 0){
//                return false;
//            }
            // when finding an opening bracket push to stack
            // closing bracket, pop
            if (character.equals('{') || character.equals('(') || character.equals('[')) {

                System.out.println("found an opening char: " + character);
                counting.push(character);
            }
            if (character.equals('}') || character.equals(')') || character.equals(']')) {
                System.out.println("found a closing char char: " + character);
                if (counting.size() == 0) {
                    return false; // if it starts with a closing bracket - it's invalid
                }
                // get index of closing character from opening character
                int characterIndex = closingCharacters.indexOf(character);
                counting.remove(openingCharacters.get(characterIndex));
            }
        }

        return counting.size() <= 0;


        // if brackets left over in stack -> invalid
        // if stack is empty - valid

    }
}
