class LibraryMember {

    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void printDetails() {
        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibraryMembershipSystem {

    public static void printMembers(LibraryMember[] members, int overdueDays) {

        System.out.println("Library Members:\n");

        for (LibraryMember member : members) {

            member.printDetails();

            // Dynamic Method Dispatch
            System.out.println("Fine : ₹" + member.calculateFine(overdueDays));

            System.out.println();
        }
    }

    public static void searchMember(LibraryMember[] members, String id) {

        for (LibraryMember member : members) {

            if (member.memberId.equals(id)) {

                System.out.println("Member Found:");
                member.printDetails();
                return;
            }
        }

        System.out.println("Member not found.");
    }

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Ankur", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Priya", "G301")
        };

        int overdueDays = 5;

        printMembers(members, overdueDays);

        System.out.println("Searching Member...\n");

        searchMember(members, "F201");
    }
}
