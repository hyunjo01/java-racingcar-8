package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.parser.CarNamesParser;
import racingcar.view.InputView;

public class RaceController {

    private final InputView inputView;
    private final CarNamesParser carNamesParser;

    public RaceController(InputView inputView, CarNamesParser carNamesParser) {
        this.inputView = inputView;
        this.carNamesParser = carNamesParser;
    }

    public void run() {
        String carNames = inputView.getCarNames();
        Cars cars = carNamesParser.parse(carNames);

        String roundNumber = inputView.getRoundNumber();
    }

}
