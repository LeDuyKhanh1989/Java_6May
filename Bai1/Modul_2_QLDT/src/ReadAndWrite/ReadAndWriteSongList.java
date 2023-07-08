package ReadAndWrite;

import Song.TheSong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteSongList {
    File theSong = new File("E:\\demogit\\Java_CodeGym\\Bai1\\Modul_2_QLDT\\src\\Data\\ListSong.csv");
    public List<TheSong> readSong() throws IOException {
        List<TheSong> theSongslist = new ArrayList<>();
        FileReader file = new FileReader(theSong);
        BufferedReader buff = new BufferedReader(file);
        String line = null;
        String[] newArr = new String[4];
        while ((line = buff.readLine()) != null) {
            newArr = line.split(",");
            TheSong song = new TheSong(newArr[0], newArr[1], newArr[2], newArr[3]);
            theSongslist.add(song);
        }
        buff.close();
        return theSongslist;
    }
    public void writeProduct(List<TheSong> songList) throws IOException {
        String data = "";
        for (int i = 0; i < songList.size(); i++) {
            data += songList.get(i).getSongID() + "," + songList.get(i).getSongName() + ","
                    + songList.get(i).getSinger() + "," + songList.get(i).getAuthor()+"\n";
        }
        FileWriter writer1 = new FileWriter(theSong);
        BufferedWriter bufer1 = new BufferedWriter(writer1);
        bufer1.write(data);
        bufer1.close();
    }
}
