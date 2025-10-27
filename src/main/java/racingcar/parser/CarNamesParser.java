package racingcar.parser;

import racingcar.model.RacingCar;
import racingcar.model.RacingCars;

import java.util.ArrayList;

public class CarNamesParser {

    private static final String DELIMITER = ",";

    public CarNamesParser() {

    }

    public ArrayList<String> parse(String carNamesString) {
        ArrayList<String> parsingNames = new ArrayList<>();
        String[] nameTokens = split(carNamesString);
        for (String nameToken: nameTokens) {
            String name = removeBlank(nameToken);
            parsingNames.add(name);
        }
        return parsingNames;
    }

    private String[] split(String carNamesString) {
        return carNamesString.split(DELIMITER);
    }

    private String removeBlank(String nameToken) {
        return nameToken.replaceAll(" ", "");
    }

}
