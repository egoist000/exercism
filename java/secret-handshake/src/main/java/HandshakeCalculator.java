import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    private static final int[] values = {1, 2, 4, 8, 16};

    public HandshakeCalculator() {
    }

    private Signal getSignal(int v) {
        switch (v) {
            case 1:
                return Signal.WINK;
            case 2:
                return Signal.DOUBLE_BLINK;
            case 4:
                return Signal.CLOSE_YOUR_EYES;
            case 8:
                return Signal.JUMP;
            default:
                return null;
        }
    }

    List<Signal> calculateHandshake(int number) {
        List<Signal> res = new ArrayList<>();
        for (Integer i : values) {
            int n = number & i;
            if(n == 16) {Collections.reverse(res);}
            else {           
                Signal s = getSignal(n);
                if(s != null) {res.add(s);}
            }
        }
        return res;
    }

}
