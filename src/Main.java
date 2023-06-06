import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn hãy nhập tên của bạn vào đây");
        String name = scanner.nextLine();
        System.out.println("xin chao "+name);
    }
}