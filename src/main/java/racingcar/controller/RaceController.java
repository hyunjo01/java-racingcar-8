package racingcar.controller;

import racingcar.view.InputView;

public class RaceController {

    private final InputView inputView;

    public RaceController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        String carNames = inputView.getCarNames();

    }

}
