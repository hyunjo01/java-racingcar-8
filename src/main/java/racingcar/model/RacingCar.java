package racingcar.model;

public class RacingCar {

    private final String name;
    private int runCount;

    private static final int NAME_MIN_LENGTH = 1;
    private static final int NAME_MAX_LENGTH = 5;

    private static final int MIN_NUMBER_TO_MOVE = 4;

    public RacingCar(String name) {
        this.name = name;
        runCount = 0;
    }

    public void move(int randomNumber) {
        if (canMove(randomNumber)) runCount++;
    }

    private boolean canMove(int randomNumber) {
        return randomNumber >= MIN_NUMBER_TO_MOVE;
    }

}
