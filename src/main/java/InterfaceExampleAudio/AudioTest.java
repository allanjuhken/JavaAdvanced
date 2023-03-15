package InterfaceExampleAudio;

public class AudioTest {
    public static void main(String[] args) {
        Playable mp3 = new Mp3player();
        mp3.play();

        Playable wav = new Wavplayer();
        wav.play();

        Playable mp4 = () -> {
            System.out.println("Playing mp4");
        };

        Playable aac = new Playable() { // Anonymous class
            private int VAL= 20;

            public int getVAL() {
                return VAL;
            }


            public int getVal() {
                return 0;
            }

            @Override
            public void play() {
                System.out.println("playing aac");
            }
        };

        aac.play();
        mp4.play();
    }
}
