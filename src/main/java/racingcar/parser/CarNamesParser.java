package racingcar.parser;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class CarNamesParser {

    private static final String DELIMITER = ",";

    public CarNamesParser() {

    }

    public Cars parse(String carNames) {
        Cars cars = new Cars();
        String[] nameTokens = split(carNames);
        for (String name: nameTokens) {
            Car car = new Car(name);
            cars.addCar(car);
        }
        return cars;
    }

    private String[] split(String carNames) {
        return carNames.split(DELIMITER);
    }

}
