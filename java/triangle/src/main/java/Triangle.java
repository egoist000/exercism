class Triangle {

    boolean isDegenerate = false;
    int equalSides = 1;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if(validTriangle(side1, side2, side3)) {
            checkDegenerate(side1, side2, side3);
            countEqualSides(side1, side2, side3);
        }
        else {throw new TriangleException();}
    }

    void countEqualSides(double s1, double s2, double s3) {
        if(s1 == s2 && s1 == s3) {equalSides = 3;}
        else if(s1 == s2 || s1 == s3){equalSides++;}
        else if(s2 == s3){equalSides++;}
    }

    void checkDegenerate(double s1, double s2, double s3) {
        if(s1 + s2 == s3 || s1 + s3 == s2 || s3 + s2 == s1) {isDegenerate = true;}
    }

    boolean validTriangle(double s1, double s2, double s3) {
        return checkForPositiveLen(s1, s2, s3) && checkSides(s1, s2, s3);
    }

    boolean checkSides(double s1, double s2, double s3) {
        return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
    }

    boolean checkForPositiveLen(double s1, double s2, double s3) {
        return s1 > 0 && s2 > 0 && s3 > 0;
    }

    boolean isEquilateral() {
        return equalSides == 3;
    }

    boolean isIsosceles() {
        return equalSides >= 2;
    }

    boolean isScalene() {
        return equalSides == 1;
    }

}
