package racingcar.model;

public class RacingCar {

    private final String name;
    private int runCount;

    private static final int NAME_MIN_LENGTH = 1;
    private static final int NAME_MAX_LENGTH = 5;

    public RacingCar(String name) {
        this.name = name;
        runCount = 0;
    }

}
