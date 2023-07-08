package Album;

import Menu.Register;
import ReadAndWrite.ReadAndWriteUser;
import Song.TheSong;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class Album implements Serializable {
    private String albumID;
    public String account;
    private List<TheSong> listSong;

    public Album(String albumID, List<TheSong> listSong) {
        this.albumID = albumID;
        this.listSong = listSong;
        this.account = Register.user.getAccount();
    }

    public String getAlbumID() {
        return albumID;
    }

    public void setAlbumID(String albumID) {
        this.albumID = albumID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public List<TheSong> getListSong() {
        return listSong;
    }

    public void setListSong(List<TheSong> listSong) {
        this.listSong = listSong;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumID='" + albumID + '\'' +
                ", listSong=" + listSong +
                '}';
    }
}
