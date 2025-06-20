package Lesson24;

public class DefaultMethods {
    public static void main(String[] args) {
        Student student = new Student();
        student.joinMeeting();  // uses default
        student.sendMessage();  // overridden

        Tutor tutor = new Tutor();
        tutor.joinMeeting();  // overridden
    }
}

interface OnlineParticipant {
    void sendMessage();

    default void joinMeeting() {
        System.out.println("Joining meeting via default link...");
    }

    default void shareScreen() {
        System.out.println("Sharing screen...");
    }
}

class Student implements OnlineParticipant {
    public void sendMessage() {
        System.out.println("Student sends a message in chat.");
    }

    // Student does NOT override joinMeeting() — uses default one
}

class Tutor implements OnlineParticipant {
    public void sendMessage() {
        System.out.println("Tutor sends a message with homework.");
    }

    @Override
    public void joinMeeting() {
        System.out.println("Tutor joins meeting as host.");
    }
}
