interface TextModeration {

    // Abstract method
    boolean isOffensive(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is not allowed.");
    }

    // Static method
    static boolean containsRestrictedWords(String post) {

        String[] restrictedWords = {"bad", "hate", "abuse"};

        post = post.toLowerCase();

        for (String word : restrictedWords) {
            if (post.contains(word)) {
                return true;
            }
        }

        return false;
    }
}

interface SpamDetection {

    // Abstract method
    boolean isSpam(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Policy: Spam content is prohibited.");
    }
}

public class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        return post.toLowerCase().contains("buy now")
                || post.toLowerCase().contains("click here");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {

        String[] posts = {
                "Hello everyone!",
                "Buy now and get 50% discount!",
                "I hate this product",
                "Click here to win prizes",
                "Have a great day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:");

        for (String post : posts) {

            if (moderator.isSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            } else if (moderator.isOffensive(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            } else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}
