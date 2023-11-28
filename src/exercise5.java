import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập xâu ký tự: ");
        String input = scanner.nextLine();

        System.out.print("Nhập kí tự cần tìm: ");
        char x = scanner.next().charAt(0);

        int lastIndex = input.lastIndexOf(x);

        if (lastIndex != -1) {
            System.out.println("Vị trí cuối cùng của kí tự '" + x + "': " + lastIndex);
        } else {
            System.out.println("Kí tự '" + x + "' không xuất hiện trong xâu.");
        }
    }
}
