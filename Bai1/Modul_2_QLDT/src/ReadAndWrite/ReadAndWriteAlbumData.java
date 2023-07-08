package ReadAndWrite;

import Album.Album;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteAlbumData {
    File ListAlbumSong = new File("E:\\demogit\\Java_CodeGym\\Bai1\\Modul_2_QLDT\\src\\Data\\AlbumData.csv");
    public List<Album> readAlbumData() {
        ObjectInputStream ois = null;
        List<Album> albums= new ArrayList<>();
        try {
            ois = new ObjectInputStream(new FileInputStream(ListAlbumSong));
            albums = (List<Album>) ois.readObject();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return albums;
    }
    public void writeAlbum(List<Album> albums)  {
        System.out.println(albums);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(ListAlbumSong));
            oos.writeObject(albums);
//            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                assert oos != null;
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


