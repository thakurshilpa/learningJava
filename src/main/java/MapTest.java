import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("Shilpa", "engineer");
        map.put("Shilpa", "doctor");
        System.out.println(map.size());
        for (Map.Entry<String, String> tr : map.entrySet()) {
            System.out.println(tr.getKey());
            System.out.println(tr.getValue());
            map.remove("Shilpa");
        }
        map.forEach((k, v) -> System.out.println("key " + k + " value " + v));
    }
}
