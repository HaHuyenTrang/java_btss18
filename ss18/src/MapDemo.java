import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> studentHashMap = new HashMap<>();
        studentHashMap.put(1, "Nguyen Van A");
        studentHashMap.put(1, "Nguyen Van B");
        studentHashMap.put(3, "Nguyen Van C");
        studentHashMap.put(2, "Nguyen Van D");

        System.out.println("Thông tin của student HashMap: "+studentHashMap);

        Map<Integer, String> studentLinkedHashMap = new LinkedHashMap<>();
        studentLinkedHashMap.put(1, "Nguyen Van A");
        studentLinkedHashMap.put(3, "Nguyen Van B");
        studentLinkedHashMap.put(2, "Nguyen Van C");

        System.out.println("Thông tin của student LinkedHashMap: "+studentLinkedHashMap);

        Map<Integer, String> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(1, "Nguyen Van A");
        studentTreeMap.put(3, "Nguyen Van B");
        studentTreeMap.put(2, "Nguyen Van C");
        System.out.println("Thông tin của student TreeMap : "+studentTreeMap);

//        Value get(Object key): lấy giá trị value theo key
        System.out.println("Value của key = 2 là: " + studentLinkedHashMap.get(2));
//        Xóa phần tử theo key
        studentLinkedHashMap.remove(2);
        System.out.println("HashMap sau khi xóa key = 2 là: "+studentHashMap);
//        Boolean containsKey(Object key): Kiểm tra trong Map có tồn tại key ko
        System.out.println("Kiểm tra trong HashMap có tồn tại key = 1 ko: "+studentHashMap.containsKey(1));
//        Set<Key> keySet(): Trả về 1 Set gồm các Key trong Set
        Set<Integer> setKey = studentHashMap.keySet();
        System.out.println("SET KEY: "+setKey);
//        Collection values(): trả về 1 collection chứa các value trong Map
        Collection<String> listValues = studentHashMap.values();
        System.out.println("List String: "+listValues);
//        Duyệt Map và in ra các thông tin
        for (Map.Entry<Integer, String> entry : studentHashMap.entrySet()) {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
//        Duyệt Map với keySet
        System.out.println("Duyệt Map với phương thức keySet");
        for (Integer key : studentHashMap.keySet()) {
            System.out.println("Key: "+key+" Value: "+studentHashMap.get(key));
        }
//        Duyệt vói phương thức value
        for (String value : studentHashMap.values()) {
            System.out.println(value);
        }
    }
}
