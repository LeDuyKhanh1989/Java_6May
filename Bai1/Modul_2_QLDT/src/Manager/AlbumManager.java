package Manager;

import Album.Album;
import Menu.AdminManagerMenu;
import Menu.Register;
import ReadAndWrite.ReadAndWriteAlbumData;
import ReadAndWrite.ReadAndWriteSongList;
import ReadAndWrite.ReadAndWriteUser;
import Song.TheSong;
import Validate.Validate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumManager {
    Validate validate = new Validate();
    Scanner inputSTR = new Scanner(System.in);
    Scanner inputNum = new Scanner(System.in);
    ReadAndWriteAlbumData readAndWriteAlbumData = new ReadAndWriteAlbumData();
    ReadAndWriteSongList readAndWriteSongList = new ReadAndWriteSongList();
    private List<Album> albumsSong;

    public AlbumManager() {
        albumsSong = readAndWriteAlbumData.readAlbumData();
    }

    public void add() throws IOException {
        System.out.println("Nhập vào tên album");
        String albumID = checkID();
        showSongs();
        List<TheSong> theSongList = new ArrayList<>();
        boolean addSong = true;
        while (addSong) {
            System.out.println("Nhập vào ID các bài hát muốn thêm vào album, nhập 0 để dừng");
            String addSongID = checkIDSong();
            TheSong theSong = readAndWriteSongList.readSong().get(findIndexAllSong(addSongID));
            theSongList.add(theSong);
            System.out.println("Bạn có muốn thêm bài hát? nhập 1 để thêm, nhập 0 để thoát");
            int selection = validate.checkNumber();
            if (selection == 0) {
                addSong = false;
            }
        }
        Album album = new Album(albumID, theSongList);
        albumsSong.add(album);
        List<Album> albumsSong2 = new ArrayList<>(albumsSong);
        readAndWriteAlbumData.writeAlbum(albumsSong2);
    }

    public void edit() throws IOException {
        System.out.println("Nhập vào tên Album muốn sửa");
        String idFix = inputSTR.nextLine();
        int index = findIndex(idFix);
        if(index!=-1){
            showSongs();
            List<TheSong> theSongList = new ArrayList<>();
            boolean addSong = true;
            while (addSong) {
                System.out.println("Nhập vào ID các bài hát muốn thêm vào album, nhập 0 để dừng");
                String addSongID = checkIDSong();
                TheSong theSong = readAndWriteSongList.readSong().get(findIndexAllSong(addSongID));
                theSongList.add(theSong);
                System.out.println("Bạn có muốn thêm bài hát? nhập 1 để thêm, nhập 0 để thoát");
                int selection = validate.checkNumber();
                if (selection == 0) {
                    addSong = false;
                }
            }
            Album album = new Album(idFix, theSongList);
            albumsSong.set(index,album);
            List<Album> albumsSong2 = new ArrayList<>(albumsSong);
            readAndWriteAlbumData.writeAlbum(albumsSong2);

        } else {
            System.out.println("Không có album này");
        }

        }

        public void delete (){
            System.out.println("Nhập vào tên Album muốn xóa");
            String idFix = inputSTR.nextLine();
            int index = findIndex(idFix);
            if(index==-1){
                System.out.println("ID không tồn tại");
            } else {
                albumsSong.remove(index);
            }
                readAndWriteAlbumData.writeAlbum(albumsSong);
        }

        public int findIndex (String id){
            for (int i = 0; i < this.albumsSong.size(); i++) {
                if (id.equals(this.albumsSong.get(i).getAlbumID())) {
                    return i;
                }
            }
            return -1;
        }

        public int findIndexAllSong (String id) throws IOException {
            for (int i = 0; i < readAndWriteSongList.readSong().size(); i++) {
                if (id.equals(readAndWriteSongList.readSong().get(i).getSongID())) {
                    return i;
                }
            }
            return -1;
        }

        public List<Album> showall () {
            albumsSong = readAndWriteAlbumData.readAlbumData();
            return albumsSong;
        }

        public String checkID () {
            boolean checkSameID = true;
            String strID;
            while (checkSameID) {
                String id = inputSTR.nextLine();
                strID = id;
                int index = findIndex(id);
                if (index == -1) {
                    checkSameID = false;
                    return strID;
                } else {
                    System.out.println("ID trùng, vui lòng nhập lại");
                }
            }
            return "ID này đã tốn tại";
        }

        public void showSongs () {
            try {
                for (TheSong s : readAndWriteSongList.readSong()) {
                    System.out.println(s);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String checkIDSong ()throws IOException {
            boolean checkSameID = true;
            String strID;
            while (checkSameID) {
                String id = inputSTR.nextLine();
                strID = id;
                int index = findIndexAllSong(id);
                if (index != -1) {
                    checkSameID = false;
                    return strID;
                } else {
                    System.out.println("Không có bài hát này, Nhập vào ID bài hát muốn thêm vào Album");
                }
            }
            return "ID này đã tốn tại";
        }
    }
