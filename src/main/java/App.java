import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String s = "1,3,5,7,8,10,12";
        int i;
        do {
            System.out.println("Nhap n: ");
            i = sc.nextInt();
        }
        while (i < 0 || i > 12);
        if (i == 2) {
            System.out.println("Thang 2 co 28 hoac 29 ngay");
        } else {
            if (s.contains(Integer.toString(i)))
                System.out.format("thang %d co 31",i);
            else System.out.format("thang %d co 30",i);
        }
    }
}


