import Observer.User;
import Topic.NewsApp;

public class Main {
    public static void main(String[] args) {

        NewsApp sportsCategory=new NewsApp("Sports");
        NewsApp weatherCategory = new NewsApp("Weather");

        User userA = new User("User A");
        User userB = new User("User B");

        // Subscribe users to categories
        sportsCategory.addObserver(userA);
        sportsCategory.addObserver(userB);

        weatherCategory.addObserver(userB);

        // Add news to categories
        sportsCategory.addNews("Team A won the match!");
        weatherCategory.addNews("Rain expected tomorrow.");

        // Unsubscribe User B from Sports
        sportsCategory.removeObserver(userB);

        // Add more news
        sportsCategory.addNews("Player X scored a hat-trick!");


    }

}