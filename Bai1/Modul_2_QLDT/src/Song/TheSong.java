package Song;

import java.io.Serializable;

public class TheSong implements Serializable {
    private String songID;
    private String songName;
    private String singer;
    private String author;
    public TheSong(String songID, String songName, String singer, String author) {

        this.songID=songID;
        this.songName = songName;
        this.singer = singer;
        this.author = author;
    }
    public String getSongID() {
        return songID;
    }
    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "TheSong{" +
                "songID='" + songID + '\'' +
                ", songName='" + songName + '\'' +
                ", singer='" + singer + '\'' +
                ", author='" + author + '\'' +
                '}'+"\n";
    }
}
