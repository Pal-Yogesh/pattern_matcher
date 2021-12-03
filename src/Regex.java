public class Regex {
    public static void main(String[] args) {
        String arr[]= {"abc@gmail.com","abcd","banana"};
        for(String res:arr){
            if(res.matches("[a-z]+@gmail.com")== true)
            {
                System.out.println(res);
            }
        }
    }
}
