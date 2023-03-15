class Ticket {
    String type;
    int quantity;
    double price;

    public Ticket(String type, int quantity, double price) {
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}

public class BusTicketApp {

    public static void main(String[] args) {
        Ticket adult = new Ticket("Взрослые", 9, 70.0);
        Ticket pensioner = new Ticket("Пенсионеры", 5, 49.0);
        Ticket child = new Ticket("Дети", 11, 35.0);

        double totalCost = adult.getTotalPrice() +
                pensioner.getTotalPrice() +
                child.getTotalPrice() * 0.5;
        System.out.println("Дата отправления автобуса: 1 июня в 7:00");
        System.out.println("Общая цена билетов: " + totalCost + " рублей");
        System.out.println("Цена билетов за взрослых " + adult.getTotalPrice());
        System.out.println("Цена билетов за пенсионеров " + pensioner.getTotalPrice());
        System.out.println("Цена билетов за детей " + child.getTotalPrice());
    }
}