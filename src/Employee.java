import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Employee {
    public String name ;
    public  int id;
    Employee(String name , int id){
        this.name=name;
        this.id=id;
    }
public String toString() {
return name + " " + id;
    }
}
class SortName implements Comparator<Employee>{
    public int compare(Employee o1,Employee o2){
        return o1.name.compareTo(o2.name);
    }
}
class SortID implements Comparator<Employee>{
    public int compare(Employee o1,Employee o2) {
    if (o1.id > o2.id)
        return 1;

    else if (o1.id < o2.id)
        return -1;
    else
    return 0;
}
}
class Example123{
     public static void main(String[] args) {
         ArrayList<Employee> obj = new ArrayList<>();
         obj.add(new Employee("abc",101));
         obj.add(new Employee("def",102));
         obj.add(new Employee("ghi",103));
         obj.add(new Employee("jkl",104));
         Collections.sort(obj,new SortName());
         System.out.println(obj);
     }
}