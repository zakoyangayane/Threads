package by.epam.learn;

public class ThreadDemo {
    public static void main(String[] args) {
        WalkThread walk = new WalkThread();
        walk.start();
        Thread talk = new Thread(new TalkThread());
        talk.start();
    }
}
