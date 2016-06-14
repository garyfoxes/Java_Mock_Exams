package threads;

import java.util.HashMap;

/**
 * Created by gfox on 29/04/2016.
 */
public class CreatingThreadLocalVariable {

    static ThreadLocal<HashMap<String, Object>> session = new ThreadLocal<HashMap<String, Object>>() {
        @Override
        protected HashMap<String, Object> initialValue() {
            return new HashMap<>();
        }
    };

    public static void setString(String key, String value) {
        session.get().put(key, value);
    }

    public static String getString(String key) {
        return (String) session.get().get(key);
    }
}

class Test {

    public static void main(String[] args) {
        CreatingThreadLocalVariable.setString("name", "Gary");
        System.out.println(CreatingThreadLocalVariable.getString("name"));
    }
}
