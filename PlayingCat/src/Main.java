public class Main {
    public static void main(String[] args) {
        boolean playing = PlayingCat.isCatPlaying(true, 10);
        System.out.println(playing);
        playing = PlayingCat.isCatPlaying(false, 36);
        System.out.println(playing);
        playing = PlayingCat.isCatPlaying(false, 35);
        System.out.println(playing);
    }
}
