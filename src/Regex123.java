public class Regex123 {
    public static void main(String[] args) {

        String arr[]={"aaa","abcd","banana"};
        for (String res:arr){
            if(res.matches("[a-z]{4}")==true){
                System.out.println(res);                            // matches method return the boolean value
            }
        }
        String str= "java programming lab";
        System.out.println(str.matches("[a-z]{4}"));
        }



}
