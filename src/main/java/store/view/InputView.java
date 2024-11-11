package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashMap;
import java.util.Map;

public class InputView {
    public Map<String, Integer> getPurchasedItems() {
        System.out.println("구매하실 상품명과 수량을 입력해 주세요. (예: [사이다-2],[감자칩-1])");
        String input = Console.readLine();
        Map<String, Integer> purchasedItems = new HashMap<>();

        // 입력 형식 파싱
        String[] items = input.replace("[", "").replace("]", "").split(",");
        for (String item : items) {
            String[] parts = item.split("-");
            purchasedItems.put(parts[0].trim(), Integer.parseInt(parts[1].trim()));
        }

        return purchasedItems;
    }

    public boolean getMembershipDiscount() {
        System.out.println("멤버십 할인을 받으시겠습니까? (Y/N)");
        return Console.readLine().equalsIgnoreCase("Y");
    }
}
