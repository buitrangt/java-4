import java.util.Arrays;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] studentNames = new String[n];

        System.out.println("Nhập danh sách tên sinh viên:");

        for (int i = 0; i < n; i++) {
            studentNames[i] = scanner.nextLine();
        }

        Arrays.sort(studentNames);

        System.out.println("Danh sách tên sinh viên sau khi sắp xếp:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
