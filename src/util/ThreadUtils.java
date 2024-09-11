package util;

import static util.MyLogger.log;

public abstract class ThreadUtils {
    public static void sleep(Long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log("인터럽드 발생, " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
