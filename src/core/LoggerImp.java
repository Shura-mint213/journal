package core;

import interfaces.Logger;

public class LoggerImp implements Logger {
    @Override
    public void logInfo(String info) {
        System.out.printf("Information:\n%s\n", info);
    }

    @Override
    public void logError(String error) {
        System.out.printf("Error information:\n%s\n", error);
    }

    @Override
    public void logDebug(String debug) {
        System.out.printf("Debug:\n%s\n", debug);
    }
}
