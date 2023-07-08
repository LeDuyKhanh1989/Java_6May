package Menu;

import Manager.SongManager;
import ReadAndWrite.ReadAndWriteSongList;
import Song.TheSong;
import Validate.Validate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchSongByAdmin {
    Scanner inputSTR = new Scanner(System.in);
    ReadAndWriteSongList readAndWriteSongList= new ReadAndWriteSongList();
    List<TheSong> listSongs;

    {
        try {
            listSongs = readAndWriteSongList.readSong();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void showSearchWays() throws IOException {
        Validate validate = new Validate();
        int choice = -1;
        SearchWays();
        while (choice != 0) {
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = validate.checkNumber();
            switch (choice) {
                case 1:
                    searchByName();
                    break;
                case 2:
                    searchBySinger();
                    break;
                case 0:
                    System.out.println("---------------User Admin form---------------");
                    System.out.println("1. Đăng ký");
                    System.out.println("2. Xem các tài khoản đẵ đăng ký");
                    System.out.println("3. Sửa tài khoản");
                    System.out.println("4. Xóa tài khoản");
                    System.out.println("5. AdminPage");
                    System.out.println("0. Thoát");
            }
        }
    }
    public void SearchWays(){
        System.out.println("==================Tìm kiếm bài hát bằng quyền Admin==================");
        System.out.println("1. Tìm kiếm bằng tên bài hát gần đúng");
        System.out.println("2. Tìm kiếm bằn tên ca sĩ");
        System.out.println("0. Thoát");
    }
    public void searchByName() throws IOException {
        System.out.println("Nhập vào tên bài hát muốn tìm: ");
        listSongs = readAndWriteSongList.readSong();
        String songName= inputSTR.nextLine();
        for (int i = 0; i < listSongs.size(); i++) {
            if(listSongs.get(i).getSongName().contains(songName)){
                System.out.println(listSongs.get(i));
            }
        }
        SearchWays();
    }
    public void searchBySinger(){
        System.out.println("Nhập vào tên ca sĩ muốn tìm: ");
        try {
            listSongs = readAndWriteSongList.readSong();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String singer= inputSTR.nextLine();
        for (int i = 0; i < listSongs.size(); i++) {
            if(listSongs.get(i).getSinger().contains(singer)){
                System.out.println(listSongs.get(i));
            }
        }
        SearchWays();
    }
}
