class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] chars = identifier.toCharArray();
        int i = 0;
        while(i < chars.length) {
            if (chars[i] == ' ') {
                builder.append('_');
                i++;
            }
            else if (chars[i] == '\0') {
                builder.append("CTRL");
                i++;
            }
            else if (chars[i] == '-') {
                try {
                    builder.append(Character.toUpperCase(chars[i + 1]));
                    i += 2;
                } catch (Exception e) {
                    return builder.toString(); //Last char is '-'
                }
            }
            else if (chars[i] >= 'α' && chars[i] <= 'ω') {
                i++;
            }
            else if (Character.isLetter(chars[i])){
                builder.append(chars[i]);
                i++;
            }
            else {i++;}
        }
        return builder.toString();
    }
}
