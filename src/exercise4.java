import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập xâu ký tự: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        System.out.println("Số từ trong xâu: " + words.length);
    }
}
