package racingcar.parser;

import racingcar.model.RacingCar;
import racingcar.model.RacingCars;

public class CarNamesParser {

    private static final String DELIMITER = ",";

    public CarNamesParser() {

    }

    public RacingCars parse(String carNames) {
        RacingCars racingCars = new RacingCars();
        String[] nameTokens = split(carNames);
        for (String name: nameTokens) {
            RacingCar racingCar = new RacingCar(name);
            racingCars.addCar(racingCar);
        }
        return racingCars;
    }

    private String[] split(String carNames) {
        return carNames.split(DELIMITER);
    }

}
