package polymorphism_;

import java.util.ArrayList;
import java.util.List;

class MediaItem {
    String title;

    public MediaItem(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing: " + title);
    }
}

class Movie extends MediaItem {
    String director;

    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    public void watch() {
        System.out.println("Watching: " + title + " (Directed by " + director + ")");
    }
}

class Music extends MediaItem {
    String artist;

    public Music(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public void listen() {
        System.out.println("Listening to: " + title + " (By " + artist + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo một danh sách các phương tiện kiểu MediaItem
        List<MediaItem> mediaList = new ArrayList<>();

        // Thêm một phim và một âm nhạc vào danh sách
        MediaItem movieItem = new Movie("Inception", "Christopher Nolan");
        mediaList.add(movieItem);

        MediaItem musicItem = new Music("Bohemian Rhapsody", "Queen");
        mediaList.add(musicItem);

        // Lặp qua danh sách và phát mọi phương tiện
        for (MediaItem item : mediaList) {
            item.play();

            // Kiểm tra nếu là Movie thì gọi phương thức watch()
            if (item instanceof Movie) {
                ((Movie) item).watch();
            }

            // Kiểm tra nếu là Music thì gọi phương thức listen()
            if (item instanceof Music) {
                ((Music) item).listen();
            }
        }
    }
}

