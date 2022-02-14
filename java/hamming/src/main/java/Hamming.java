public class Hamming {

    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()) {
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
        }
        else if (leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if (rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        int hamming = 0;
        String[] lc = leftStrand.split("");
        String[] rc = rightStrand.split("");
        for(int i = 0; i < leftStrand.length(); i++) {
            if (!rc[i].equals(lc[i])) {hamming++;}
        }
        return hamming;
    }
}
