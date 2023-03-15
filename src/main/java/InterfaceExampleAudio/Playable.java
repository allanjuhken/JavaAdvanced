package InterfaceExampleAudio;

@FunctionalInterface
public interface Playable {
    // An abstract class is used when you waNT TO share functionality between
    // related objects or classes

    // An interface on the other is like a contract that applies the functionality
    // defined in it to any class that implements it

    // Single Abstract method = SAM = Functional Interface
    //int getVal(); // ei saa kasutada sest võib olla ainult üks abstract meetod korraga
    void play();
}
