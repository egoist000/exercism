import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow(IntStream.range(1, input + 1).sum(), 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i : IntStream.range(1, input + 1).toArray()) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
