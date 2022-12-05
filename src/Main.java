public class Main {
    public static void main(String[] args) {
        System.out.println("Подождите минутку, считаем Ваши бонусные мили.....");

        int ticket = 10_005;
        int bonusMiles = 20;
        int promotion = ticket / bonusMiles;

        System.out.println("Поздравляем! Теперь у Вас есть " + promotion + " бонусных миль");

    }
}
