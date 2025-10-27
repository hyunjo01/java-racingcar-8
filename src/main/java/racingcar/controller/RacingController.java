package racingcar.controller;

import racingcar.model.RacingCars;
import racingcar.parser.CarNamesParser;
import racingcar.view.InputView;

public class RacingController {

    private final InputView inputView;
    private final CarNamesParser carNamesParser;

    public RacingController(InputView inputView, CarNamesParser carNamesParser) {
        this.inputView = inputView;
        this.carNamesParser = carNamesParser;
    }

    public void run() {
        String carNames = inputView.getCarNames();
        RacingCars racingCars = carNamesParser.parse(carNames);

        String roundNumber = inputView.getRoundNumber();
    }

}
