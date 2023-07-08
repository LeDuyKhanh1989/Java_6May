package Menu;

import Manager.SongManager;
import ReadAndWrite.ReadAndWriteSongList;
import Song.TheSong;
import Validate.Validate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AdminManagerMenu {
    Validate menuValidate = new Validate();
    Scanner inputSTR = new Scanner(System.in);
    ReadAndWriteSongList readAndWriteSongList = new ReadAndWriteSongList();
    private SongManager songManager=new SongManager();
    public void ShowAdminPage() throws IOException {
        Validate validate = new Validate();
        int choice = -1;
        showMenu();
        while (choice != 0) {
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = menuValidate.checkNumber();
            switch (choice) {
                case 1:
                    songManager.add();
                    showMenu();
                    break;
                case 2:
                    System.out.println("Nhập vào ID bài hát");
                    String songID = inputSTR.nextLine();
                    songManager.edit(songID);
                    showMenu();
                    break;
                case 3:
                    System.out.println("Nhập vào ID bài hát");
                    String songIDDelete = inputSTR.nextLine();
                    songManager.delete(songIDDelete);
                    showMenu();
                    break;
                case 4:
                    List<TheSong> songManagerList= songManager.showall();
                    for (TheSong s:songManagerList) {
                        System.out.println(s);
                    }
                    showMenu();
                    break;
                case 5:
                    SearchSongByAdmin searchSongByAdmin = new SearchSongByAdmin();
                    searchSongByAdmin.showSearchWays();
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }
    }
    public void showMenu(){
        System.out.println("---------------Nghe nhạc online - Addmin form---------------");
        System.out.println("1. Thêm bài hát");
        System.out.println("2. Sửa bài hát");
        System.out.println("3. Xóa bài hát");
        System.out.println("4. Hiển thị tất cả bài hát");
        System.out.println("5. Tìm kiếm");
        System.out.println("0. Thoát");
    }
}
