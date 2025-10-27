package racingcar.domain;

public class Car {

    private final String name;
    private int runCount;

    private static final int NAME_MAX_LENGTH = 5;

    public Car(String name) {
        this.name = name;
        runCount = 0;
    }

}
