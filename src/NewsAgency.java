import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private List<Subscriber> subscriberList = new ArrayList<>();
    private String latestNews;

    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println("LOG: New subscriber added.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.println("LOG: Subscriber removed.");
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(latestNews);
        }
    }

    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\n--- Breaking News: " + news + " ---");
        notifySubscribers();
    }
}