public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber sub1 = new Subscriber("Subscriber 1");
        Subscriber sub2 = new Subscriber("Subscriber 2");

        agency.addObserver(sub1);
        agency.addObserver(sub2);

        agency.publishNews("Major earthquake hits city!");

        agency.removeObserver(sub1);

        agency.publishNews("Stock market surges!");
    }
}
