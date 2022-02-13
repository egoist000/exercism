import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator {

    public PigLatinTranslator() {
    
    }
    
    public String translate(String s) {
        StringBuilder res = new StringBuilder();
        String s_pattern = "^([^aeiouq]*(qu)|y|[^aeiouy]*)(y?.*)$";
        Pattern p = Pattern.compile(s_pattern);
        String[] words = s.split(" ");
        for (String w : words) {
            Matcher m = p.matcher(w);         
            if(Pattern.matches("^(xr|yt).*", w)) {
                res = res.append(w).append("ay");
            }
            else if(m.find()) {
                res = res.append(m.group(3)).append(m.group(1)).append("ay");
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

}