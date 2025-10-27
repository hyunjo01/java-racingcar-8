package racingcar;

import racingcar.controller.RaceController;
import racingcar.parser.CarNamesParser;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        CarNamesParser carNamesParser = new CarNamesParser();
        RaceController raceController = new RaceController(inputView, carNamesParser);
        raceController.run();

    }
}
