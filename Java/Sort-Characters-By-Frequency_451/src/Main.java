import java.util.*;

public class Main {


    public static void main(String[] args) {
        System.out.println(frecuencySort("loveleetcode"));
    }

    public static String frecuencySort(String s) {
        char[] sample = s.toCharArray();

        Map<Character, Integer> frec = new HashMap<>();
        for(char i : sample) {
            if(frec.containsKey(i)) {
                frec.put(i, frec.get(i)+1);
            } else {
                frec.put(i, 1);
            }
        }

        Comparator<Map.Entry<Character, Integer>> comp = (o1, o2) -> frec.get(o2.getKey()) - frec.get(o1.getKey());

        var set = new ArrayList<>(frec.entrySet().stream().toList());

        set.sort(comp);

        StringBuilder ret = new StringBuilder(sample.length);

        for (int i = 0; i < set.size(); i++) {
            for (int j = 0; j < set.get(i).getValue(); j++) {
                ret.append(set.get(i).getKey());
            }
        }

        return ret.toString();
    }
}