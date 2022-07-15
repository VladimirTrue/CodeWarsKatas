import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        StringBuffer sb = new StringBuffer();
    /*    list.forEach(s -> sb.append("Значение " + s + "\n"));
        sb.append(" union all");
        System.out.println(sb.toString());
        sb.toString().trim();
        System.out.println(sb.toString().split(".* union all")[0]);
     //   System.out.println(sb.toString());*/


        System.out.println("!!!!!!!!");
        String prefix = "";
        for (String serverId : list) {
            sb.append(prefix);
            prefix = ",";
            sb.append(serverId);
        }
        System.out.println(sb.toString());
    }

}