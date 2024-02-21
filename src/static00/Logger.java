package static00;

public class Logger {

    private static String logLevel = "INFO";

    public static void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }

    public static void logError(String message) {
        if (logLevel.equals("ERROR")) {
            System.out.println("[ERROR] " + message);
        }
    }

    public static void setLogLevel(String logLevel) {
        Logger.logLevel = logLevel;
    }
}
