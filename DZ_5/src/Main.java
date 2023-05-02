import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> Map1 = new HashMap<>();

        Map1.put("Предмет 1", "Мяч");
        Map1.put("Предмет 2", "Ракетка");
        Map1.put("Предмет 3", "Батон");
        Map1.put("Предмет 4", "Бита");
        Map1.put("Предмет 5", "Стол");
        Map1.put("Предмет 6", "Печь");
        Map1.forEach((k, v) -> System.out.println("Порядковый номер предмета: " + k + "\n"+ "Название предмета: " + v));

        Map1.replaceAll((a, b) -> b + "!");
        Map1.forEach((k, v) -> System.out.println((k + " " + v)));
        System.out.println("=".repeat(20));

        Map<String, String> Map2 = new HashMap<>();
        Map2.put("Предмет_1", "Рулон");
        Map2.put("Предмет 2", "Вантуз");
        Map2.put("Предмет_3", "Вагон");
        Map2.put("Предмет 4", "Тренер");
        Map2.put("Предмет_5", "Сучок");
        Map2.put("Предмет 6", "Грибо4ek");

        for (String item : Map1.keySet()) {
            Map1.merge(item, Map2.getOrDefault(item, ""), (newVal, tempVal) -> newVal + tempVal);
        }

        Map1.forEach((k, v) -> System.out.println(k + " " + v));

    }

}
