import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        String inputString = "example";

        ArrayList<Character> charList = new ArrayList<>();

        for (char c : inputString.toCharArray()) {
            charList.add(c);
        }

        if (charList.size() >= 3) {
            charList.set(2, 'z');
        }

        for (char c : charList) {
            System.out.print(c);
        }
    }
}
