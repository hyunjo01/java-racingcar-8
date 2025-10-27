package racingcar.domain;

public class Car {

    private final Name name;
    private int runCount;

    public Car(String nameString) {
        name = new Name(nameString);
        runCount = 0;
    }

}
