package racingcar.controller;

import racingcar.model.RacingCars;
import racingcar.service.RacingService;
import racingcar.view.InputView;

public class RacingController {

    private final InputView inputView;
    private final RacingService racingService;

    public RacingController(InputView inputView, RacingService racingService) {
        this.inputView = inputView;
        this.racingService = racingService;
    }

    private String getCarNames() {
        return inputView.getCarNames();
    }

    private RacingCars createRacingCars(String carNamesString) {
        return racingService.createRacingCars(carNamesString);
    }


    public void run() {
        String carNamesString = getCarNames();
        RacingCars racingCars = createRacingCars(carNamesString);

        String roundNumber = inputView.getRoundNumber();
    }

}
