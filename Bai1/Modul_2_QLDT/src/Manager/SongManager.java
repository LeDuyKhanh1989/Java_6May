package Manager;

import Album.Album;
import ReadAndWrite.ReadAndWriteAlbumData;
import Song.TheSong;
import ReadAndWrite.ReadAndWriteSongList;
import Validate.Validate;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongManager {
    Validate validate = new Validate();
    Scanner inputSTR= new Scanner(System.in);
    private List<TheSong> songsArr;
    ReadAndWriteSongList readAndWriteTheSong = new ReadAndWriteSongList();
    public SongManager(){
        try {
            songsArr = readAndWriteTheSong.readSong();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void add() {
        System.out.println("Nhập vào ID");
        String id = checkID();
        System.out.println("Nhập vào tên bài hát");
        String songName= validate.validateAlphabet();
        System.out.println("Nhập vào tên ca sĩ");
        String singerName= validate.validateAlphabet();
        System.out.println("Nhập vào tên tác giả");
        String authorName= validate.validateAlphabet();
        TheSong theSong = new TheSong(id, songName, singerName, authorName);
        songsArr.add(theSong);
        try {
            readAndWriteTheSong.writeProduct(songsArr);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void edit(String id) {
        int index= findIndex(id);
        if(index!=-1) {
            System.out.println("Nhập vào tên bài hát");
            String songName = validate.validateAlphabet();
            System.out.println("Nhập vào tên ca sĩ");
            String singerName = validate.validateAlphabet();
            System.out.println("Nhập vào tên tác giả");
            String authorName = validate.validateAlphabet();
            TheSong theSong = new TheSong(id, songName, singerName, authorName);
            songsArr.set(index, theSong);
            try {
                readAndWriteTheSong.writeProduct(songsArr);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Không có ID này");
        }
    }
    public void delete(String id) {
        int index= findIndex(id);
        if(index==-1){
            System.out.println("ID không tồn tại");
        } else {
            songsArr.remove(index);
        }
        try {
            readAndWriteTheSong.writeProduct(songsArr);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public TheSong findSong(String id){
        try {
            songsArr = readAndWriteTheSong.readSong();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int index=findIndex(id);
        TheSong theSong = new TheSong(id,songsArr.get(index).getSongName(),songsArr.get(index).getSinger(),songsArr.get(index).getAuthor());
        return theSong;
    }
    public int findIndex(String id) {
        for (int i = 0; i <this.songsArr.size() ; i++) {
            if(id.equals(this.songsArr.get(i).getSongID())){
                return i;
            }
        }
        return -1;
    }

    public List<TheSong> showall() {
        try {
            return readAndWriteTheSong.readSong();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String checkID(){
        boolean checkSameID= true;
        String strID;
        while(checkSameID){
            String id= inputSTR.nextLine();
            strID= id;
            int index = findIndex(id);
            if(index==-1){
                checkSameID=false;
                return strID;
            } else {
                System.out.println("ID trùng, vui lòng nhập lại");
            }
        }
        return "ID này đã tốn tại";
    }

    @Override
    public String toString() {
        return "SongManager{" +
                "songsArr=" + songsArr +
                '}';
    }
}
