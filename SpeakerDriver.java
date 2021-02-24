import java.util.*;


public class SpeakerDriver {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Speaker john = new MotivationalSpeaker();
        Speaker jacob = new Pastor();
        Speaker jose = new LifeCoach();

        john.speak();
        john.announce("Hello");
        jacob.speak();
        jacob.announce("world");
        jose.speak();
        jose.announce("java!");

    }
}
