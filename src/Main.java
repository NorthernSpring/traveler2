public class Main {
    public static void main(String[] args) {
        //х стоимость билета
        int ticketPrice = 87000;
        //b = стоимость одной бонусной мили
        int milesPrice = 20;
        // n = колличество начисленных бонусных миль
        int bonusGift = ticketPrice /  milesPrice;

        System.out.println("колличество бонусных миль:" + bonusGift);
    }
}