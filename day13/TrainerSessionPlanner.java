package day13;

import java.util.Scanner;

class Session {

    String topic;
    int duration;
    String trainer;
    String room;

    Session(String topic, int duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    Session(String topic, int duration) {
        this(topic, duration, "Not Assigned", "Not Assigned");
    }

    Session(String topic) {
        this(topic, 1, "Not Assigned", "Not Assigned");
    }

    void display() {
        System.out.println("\nSESSION DETAILS");
        System.out.println("Topic    : " + topic);
        System.out.println("Duration : " + duration + " hours");
        System.out.println("Trainer  : " + trainer);
        System.out.println("Room     : " + room);
    }
}

public class TrainerSessionPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Details for Session 1");

        System.out.print("Enter Topic: ");
        String topic1 = sc.nextLine();

        Session s1 = new Session(topic1);

        System.out.println("\nEnter Details for Session 2");

        System.out.print("Enter Topic: ");
        String topic2 = sc.nextLine();

        int duration;
        do {
            System.out.print("Enter Duration (hours): ");
            duration = sc.nextInt();

            if (duration <= 0)
                System.out.println("Duration must be greater than 0.");
        } while (duration <= 0);

        sc.nextLine();

        Session s2 = new Session(topic2, duration);

        System.out.println("\nEnter Details for Session 3");

        System.out.print("Enter Topic: ");
        String topic3 = sc.nextLine();

        do {
            System.out.print("Enter Duration (hours): ");
            duration = sc.nextInt();

            if (duration <= 0)
                System.out.println("Duration must be greater than 0.");
        } while (duration <= 0);

        sc.nextLine();

        System.out.print("Enter Trainer Name: ");
        String trainer = sc.nextLine();

        System.out.print("Enter Room: ");
        String room = sc.nextLine();

        Session s3 = new Session(topic3, duration, trainer, room);

        System.out.println("\n******** SESSION INFORMATION ********");

        System.out.println("\nSession 1");
        s1.display();

        System.out.println("\nSession 2");
        s2.display();

        System.out.println("\nSession 3");
        s3.display();

        sc.close();
    }
}

