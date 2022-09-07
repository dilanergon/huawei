package utility;

import io.qameta.allure.Step;

;

public class AllureLogger {

    private AllureLogger() {

    }

    @Step("{0}")
    public static void logToAllure(String message) {
//      logger.debug("Logged to allure: " + message);
    }
    
}
