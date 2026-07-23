import java.util.Scanner;

public class App {

    private Scanner scanner;

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            switch (command) {
                case "등록" -> {
                    System.out.print("명언 : ");
                    String saying = scanner.nextLine();
                    System.out.print("작가 : ");
                    String author = scanner.nextLine();
                }
                case "종료" -> {
                    return;
                }
            }
        }
    }
}
