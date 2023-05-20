package core;

import interfaces.DataChecking;
import interfaces.Logger;

public class DataCheckingImp implements DataChecking {
    Logger logger;

    public DataCheckingImp() {
        logger = new LoggerImp();
    }

    /** Specifies the logging method */
    public DataCheckingImp(Logger logger) {
        this.logger = logger;
    }

    private final String INT_REGEX = "^((-)?[0-9]+)"; //constant to check if a value is a number
    @Override
    public Boolean intValidation(String number) {
        if (number.matches(INT_REGEX)) {
            try {
                int num = Integer.parseInt(number);
                logger.logInfo(number);
            } catch(NumberFormatException e) {
                logger.logError("Overflow");
            }
        } else {
            logger.logError("Enter the number");
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
