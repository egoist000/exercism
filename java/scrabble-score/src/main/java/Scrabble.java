class Scrabble {

    private String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int score = 0;
        int i = 0;
        while(i < this.word.length()) {
            char c = this.word.charAt(i);
            switch (c) {
                case 'D': case 'G':
                    score += 2;
                    break;
                case 'B': case 'C': case 'M': case 'P':
                    score += 3;
                    break;
                case 'F': case 'H': case 'V': case 'W': case 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J': case 'X':
                    score += 8;
                    break;
                case 'Q': case 'Z':
                    score += 10;
                    break;
                default:
                    score += 1;
                    break;
            }
            i++;
        }
        return score;
    }

}
