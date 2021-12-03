import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions {
    public static void main(String[] args) {
        String target = "JDBC regular expression JDBC is important";
        Pattern p = Pattern.compile("JDBC");
        Matcher m = p.matcher(target);
        int ctr =0;
        while (m.find())    // return type is boolean of find method
        {
            ctr++;
            System.out.println(m.start()+"----"+m.end()+"----"+m.group());
        }
        System.out.println(ctr);
    }

}
