import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Anagram
 */
public class Anagram {
    
    private List<String> chars = new ArrayList<>();
    private String word;

    public Anagram(String word) {
        this.word = word.toLowerCase();
        chars.addAll(Arrays.asList(word.toLowerCase().split("")));
    }
    
    public List<String> match(List<String> candidates) {
        List <String> res = new ArrayList<>();
        for (String candidate : candidates) {
            String cand = candidate.toLowerCase();
            if(!cand.equals(word)) {
                List<String> chrs = new LinkedList<String> (Arrays.asList(cand.split("")));
                for (String c : chars) {
                    try {
                        if(!chrs.remove(c)) {break;}
                    } catch (Exception e) {
                        break;
                    }
                }
                if(chrs.isEmpty()) {res.add(candidate);}
            }
        }
        return res;
    }

}