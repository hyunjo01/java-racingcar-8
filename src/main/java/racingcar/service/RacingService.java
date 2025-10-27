package racingcar.service;

import racingcar.model.RacingCar;
import racingcar.model.RacingCars;
import racingcar.parser.CarNamesParser;

import java.util.ArrayList;

public class RacingService {

    private final CarNamesParser carNamesParser;

    public RacingService(CarNamesParser carNamesParser) {
        this.carNamesParser = carNamesParser;
    }

    public RacingCars createRacingCars(String carNamesString) {
        RacingCars racingCars = new RacingCars();
        ArrayList<String> parsingNames = carNamesParser.parse(carNamesString);
        for (String name: parsingNames) {
            RacingCar racingCar = new RacingCar(name);
            racingCars.addCar(racingCar);
        }
        return racingCars;
    }

}
