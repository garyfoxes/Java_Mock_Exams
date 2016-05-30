package threads;

import java.util.HashMap;

/**
 * Created by gfox on 29/04/2016.
 */
public class SessionData {

    public static HashMap<String, Object> session = new HashMap<>();

    public static void setString(String key, String value) {
        session.put(key, value);
    }

    public static String getString(String key) {
        return (String) session.get(key);
    }
}

class testSession {

    public static void main(String[] args) {
        SessionData.setString("name", "Gary");
        SessionData.setString("age", "31");
        System.out.println(SessionData.getString("name"));
        System.out.println(SessionData.getString("age"));
    }
}
