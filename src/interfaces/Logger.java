package interfaces;

/** Interface for logging */
public interface Logger {
    void logInfo(String info);

    void logError(String error);

    void logDebug(String debug);
}
