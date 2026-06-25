interface StreamingService {

    // Abstract method
    void streamMovie();

    // Default method
    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Plan");
    }
}

interface GamingService {

    // Abstract method
    void playGame();

    // Default method
    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold Plan");
    }
}

public class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming Movies...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing Games...");
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Inception",
                "Interstellar"
        };

        String[] games = {
                "FIFA 25",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.streamMovie();
        tv.playGame();

        System.out.println("\nSubscription Details:");
        tv.showSubscriptionDetails();

        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}
