
package hrforms;

public class AccessControl {
    public boolean canAccess(String role, String section) {
        if ("TI".equals(section) && !"TI".equals(role)) {
            return false; // Restrição de acesso
        }
        return true;
    }
}
