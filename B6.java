import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 ){
            System.out.println(number + "lớn hơn 0");
        }else {
            System.out.println(number + "bé hơn 0 ");
        }
    }
}
