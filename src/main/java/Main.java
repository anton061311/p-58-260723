import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        experiment1();
    }

    public static void experiment1() {

        String input = """
                등록
                너 자신을 알라
                """;
        Scanner scanner = new Scanner(input);
        String command = scanner.nextLine();
        String saying = scanner.nextLine();
        System.out.println("입력한 명령어: " + command);
        System.out.println("입력한 명언: " + saying);

    }

}