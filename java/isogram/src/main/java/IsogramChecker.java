class IsogramChecker {

    boolean isIsogram(String phrase) {
        String[] arr = phrase.split("");
        int i = 0;
        while(i < arr.length - 1) {
            if (!arr[i].equals("-") && !arr[i].equals(" ")) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i].equalsIgnoreCase(arr[j])) {
                        return false;
                    }
                }
            }
            i++;
        }
        return true;
    }

}
