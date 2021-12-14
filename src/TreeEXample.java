import java.util.Comparator;
import java.util.TreeMap;
public class TreeEXample {

    public static void main(String[] args) {
//     //   TreeEXample ts = new TreeEXample(new MyCom());
//        ts.put("aaa",10);
//        ts.put("bbb",20);
//        ts.put("ccc",30);
//        ts.put("ddd",40);
//        System.out.println(ts);
//    }
}
class MyCom implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = o1.toString();
        String str2 = o2.toString();
        return str2.compareTo(str1);

    }
}}
