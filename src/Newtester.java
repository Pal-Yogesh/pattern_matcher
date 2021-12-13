import java.util.TreeSet;
public class Newtester {
    public static void main(String[] args) {
        TreeSet obj = new TreeSet();
        obj.add(10);
        obj.add(200);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.add(70);

        System.out.println(obj.last());
        System.out.println(obj.first());
        System.out.println(obj.headSet(50));
        System.out.println(obj.tailSet(40));
        System.out.println(obj.subSet(20,70));


    }
}
