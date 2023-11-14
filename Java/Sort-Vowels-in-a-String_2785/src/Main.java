import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }

    public static String sortVowels(String s) {
        char[] leters = s.toCharArray();
        List<Integer> vowelsPos = new ArrayList<>(s.length());
        List<Character> vowels = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if(leters[i] == 'A' || leters[i] == 'E' || leters[i] == 'I' || leters[i] == 'O' || leters[i] == 'U' ||
                    leters[i] == 'a' || leters[i] == 'e' || leters[i] == 'i' || leters[i] == 'o' || leters[i] == 'u') {
                vowelsPos.add(i);
                vowels.add(leters[i]);
            }
        }
        vowels.sort(null);
        for (int i = 0; i < vowelsPos.size(); i++) {
            leters[vowelsPos.get(i)] = vowels.get(i);
        }
        return String.copyValueOf(leters);
    }
}