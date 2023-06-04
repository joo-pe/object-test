package cleancode;

import java.util.List;

/**
 * 일급컬렉션 써보기
 */
public class Test3 {
    public class RacingGame {
        private final List<Car> cars;
        String carName;
        //...

        public RacingGame(String carInputs) {
            cars = initCars(carInputs.trim());
        }
        // ...

        public List<Car> initCars(String carName) {
            return null;
        }
    }

    public static class Car {

    }
}
