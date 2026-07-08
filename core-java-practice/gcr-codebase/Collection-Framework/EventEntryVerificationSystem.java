import java.util.HashSet;

public class EventEntryVerificationSystem {

    private HashSet<String> participants = new HashSet<>();

    // 1. Register new participant
    public void registerParticipant(String email) {
        if (participants.add(email)) {
            System.out.println("Registration successful: " + email);
        } else {
            System.out.println("Duplicate registration rejected: " + email);
        }
    }

    // 2 & 3. Display all unique participants
    public void displayParticipants() {
        System.out.println("\nRegistered Participants:");
        if (participants.isEmpty()) {
            System.out.println("No participants registered.");
        } else {
            for (String email : participants) {
                System.out.println(email);
            }
        }
    }

    // 4. Show total attendees
    public void showTotalAttendees() {
        System.out.println("\nTotal Eligible Attendees: " + participants.size());
    }

    public static void main(String[] args) {
        EventEntryVerificationSystem event = new EventEntryVerificationSystem();

        event.registerParticipant("ankur@gmail.com");
        event.registerParticipant("rahul@gmail.com");
        event.registerParticipant("priya@gmail.com");
        event.registerParticipant("ankur@gmail.com"); // duplicate

        event.displayParticipants();
        event.showTotalAttendees();
    }
}
