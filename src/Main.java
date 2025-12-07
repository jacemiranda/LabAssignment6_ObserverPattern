public class Main {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        NewsSubscriber user1 = new NewsSubscriber("Djem Andreif Reyes");
        NewsSubscriber user2 = new NewsSubscriber("John Marc Sanchez");
        NewsSubscriber user3 = new NewsSubscriber("Ramil Deocariza Jr.");

        System.out.println("--- System Initialization ---");
        agency.subscribe(user1);
        agency.subscribe(user2);

        agency.publishNews("Typhoon Signal No. 1 raised in Metro Manila.");

        System.out.println("\n--- Updating Subscriptions ---");
        agency.unsubscribe(user2);
        agency.subscribe(user3);
        
        agency.publishNews("Classes suspended for all levels tomorrow.");
    }
}