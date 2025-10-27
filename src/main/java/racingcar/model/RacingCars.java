package racingcar.model;

import java.util.ArrayList;

public class RacingCars {

    private ArrayList<RacingCar> values;

    public RacingCars() {
        values = new ArrayList<>();
    }

    public void addCar(RacingCar racingCar) {
        values.add(racingCar);
    }

    public void runRound(RandomNumberGeneration randomNumberGeneration) {
        for (RacingCar racingCar: values) {
            racingCar.move(randomNumberGeneration.generate());
        }
    }

}
