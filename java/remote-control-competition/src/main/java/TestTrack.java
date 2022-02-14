import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> res = new LinkedList<>();
        res.add(prc1);
        res.add(prc2);
        Collections.sort(res);
        return res;
    }
}
