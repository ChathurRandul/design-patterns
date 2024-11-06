package structural.adapter;

//  Allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces.

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "unknown.avi");
    }
}