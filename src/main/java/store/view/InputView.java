package store.view;

import java.io.Console;

public class InputView {

    private static final Console console = System.console();

    public static String getPurchaseInput() {
        if (console == null) {
            throw new IllegalStateException("콘솔을 사용할 수 없습니다. 터미널에서 프로그램을 실행해 주세요.");
        }
        System.out.println("구매하실 상품명과 수량을 입력해 주세요. (예: [사이다-2],[감자칩-1])");
        return console.readLine().trim();
    }

    public static String getYesNoInput(String message) {
        if (console == null) {
            throw new IllegalStateException("콘솔을 사용할 수 없습니다. 터미널에서 프로그램을 실행해 주세요.");
        }
        System.out.println(message + " (Y/N)");
        return console.readLine().trim().toUpperCase();
    }
}
