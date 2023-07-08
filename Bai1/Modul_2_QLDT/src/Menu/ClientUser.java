package Menu;

import Album.Album;
import Manager.AlbumManager;
import ReadAndWrite.ReadAndWriteAlbumData;
import ReadAndWrite.ReadAndWriteSongList;
import ReadAndWrite.ReadAndWriteUser;
import Song.TheSong;
import Validate.Validate;
import Menu.Register;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ClientUser {
    Scanner inputSTR = new Scanner(System.in);
    ReadAndWriteUser readAndWriteUser2 = new ReadAndWriteUser();
    ReadAndWriteSongList readAndWriteSongList2 = new ReadAndWriteSongList();
    ReadAndWriteAlbumData readAndWriteAlbumData = new ReadAndWriteAlbumData();
    Validate validate = new Validate();
    AlbumManager albumManager = new AlbumManager();

    public void showClientPage() {
        Validate validate = new Validate();
        int choice = -1;
        showUserForm();
        while (choice != 0) {
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = validate.checkNumber();
            switch (choice) {
                case 1:
                    List<TheSong> songsList = showSongList();
                    for (int i = 0; i < songsList.size(); i++) {
                        System.out.println(songsList.get(i));
                    }
                    showUserForm();
                    break;
                case 2:
                    try {
                        albumManager.add();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    showUserForm();
                    break;
                case 3:
                    showListAlbum();
                    showListAlbumCase();
                    break;
                case 0:
                    System.out.println("---------------Register form---------------");
                    System.out.println("1. Đăng nhập");
                    System.out.println("0. Thoát");
                    break;
            }
        }
    }


    public void showUserForm() {
        System.out.println("---------------Nghe nhạc online---------------");
        System.out.println("1. Danh sách bài hát");
        System.out.println("2. Tạo album");
        System.out.println("3. Danh sách albums");
        System.out.println("0. Thoát");
    }

    public void showListAlbumCase() {
        Validate validate = new Validate();
        int choice = -1;
        while (choice != 0) {
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = validate.checkNumber();
            switch (choice) {
                case 1:
                    List<Album> newList = readAndWriteAlbumData.readAlbumData();
                    for (Album s : newList) {
                        System.out.println(s);
                    }
                    showListAlbum ();
                    break;
                case 2:
                    try {
                        albumManager.edit();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    showListAlbum ();
                    break;
                case 3:
                    albumManager.delete();
                    showListAlbum ();
                    break;
                case 0:
                    showUserForm();
                    break;
            }
        }
    }

        public void showListAlbum () {
            System.out.println("---------------Danh sách album của bạn---------------");
            System.out.println("1. Xem danh sách album");
            System.out.println("2. Sửa album");
            System.out.println("3. Xóa Album");
            System.out.println("0. Thoát");
        }


        public List<TheSong> showSongList () {
            List<TheSong> listSong;
            try {
                listSong = readAndWriteSongList2.readSong();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return listSong;
        }
    }
