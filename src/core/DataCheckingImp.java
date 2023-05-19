package core;

import interfaces.DataChecking;

public class DataCheckingImp implements DataChecking {

    private final String INT_REGEX = "^((-|\\+)?[0-9]{10})";
    @Override
    public Boolean intValidation(String number) {
        if (!number.matches(INT_REGEX)) {

        }
        return null;
    }

    @Override
    public Boolean fioValidation(String fio) {
        return null;
    }

    @Override
    public Boolean ageValidation(String age) {
        return null;
    }
}
