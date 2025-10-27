package racingcar.domain;

import java.util.ArrayList;

public class Cars {

    private ArrayList<Car> values;

    public Cars() {
        values = new ArrayList<>();
    }

    public void addCar(Car car) {
        values.add(car);
    }

}
