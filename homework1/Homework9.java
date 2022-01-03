import java.util.Date;
import java.text.SimpleDateFormat;

public class Homework9 {
    public static void main(String[] args) {
        Date today = new Date();
    
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
        System.out.println("현재 시간은 " + date.format(today));
    }
}
