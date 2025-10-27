package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGeneration {

    private static final int RANDOM_NUMBER_MIN_RANGE = 0;
    private static final int RANDOM_NUMBER_MAX_RANGE = 9;

    public RandomNumberGeneration() {

    }

    public int generate() {
        return Randoms.pickNumberInRange(RANDOM_NUMBER_MIN_RANGE, RANDOM_NUMBER_MAX_RANGE);
    }
}
