import java.util.Scanner;

public class App {

    private Scanner scanner;
    private WiseSayingController wiseSayingController;
    private SystemController systemController = new SystemController();

    public App(Scanner scanner) {
        this.scanner = scanner;
        this.wiseSayingController = new WiseSayingController(scanner);
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            switch (command) {
                case "등록" -> wiseSayingController.actionAdd();
                case "목록" -> wiseSayingController.actionList();
                case "종료" -> {
                    systemController.actionExit();
                }
            }
        }
    }
}
