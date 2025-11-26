
package hrforms;

import java.util.HashMap;

public class SessionManager {
    private static final long TIMEOUT = 300_000; // 5 minutes
    private HashMap<String, Long> sessionMap = new HashMap<>();

    public void login(String userId) {
        sessionMap.put(userId, System.currentTimeMillis());
    }

    public boolean isSessionActive(String userId) {
        Long lastActive = sessionMap.get(userId);
        return lastActive != null && (System.currentTimeMillis() - lastActive) < TIMEOUT;
    }
}
