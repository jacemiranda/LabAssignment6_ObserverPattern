public class NewsSubscriber implements Subscriber {
    private String subscriberName;

    public NewsSubscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(subscriberName + " received notification: " + news);
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}