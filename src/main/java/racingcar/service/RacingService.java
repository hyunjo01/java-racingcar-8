package racingcar.service;

import racingcar.model.RacingCar;
import racingcar.model.RacingCars;
import racingcar.model.RandomNumberGeneration;
import racingcar.parser.CarNamesParser;

import java.util.ArrayList;

public class RacingService {

    private final CarNamesParser carNamesParser;
    private final RandomNumberGeneration randomNumberGeneration;

    public RacingService(CarNamesParser carNamesParser, RandomNumberGeneration randomNumberGeneration) {
        this.carNamesParser = carNamesParser;
        this.randomNumberGeneration = randomNumberGeneration;
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

    public void runRound(RacingCars racingCars) {
        racingCars.runRound(randomNumberGeneration);
    }

    public void play(RacingCars racingCars, int roundNumber) {
        for (int i = 0; i < roundNumber; i++) {
            runRound(racingCars);
        }
    }

}
