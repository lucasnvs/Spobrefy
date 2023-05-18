import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.spobrefy.content.Music;
import com.spobrefy.content.Playlist;
import com.spobrefy.users.*;

public class Sistema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Artist> artistList = new ArrayList<>();

        Artist teto = new Artist("Teto", "teti@gmail.com", "30praUm", "2335345345", "10/10/2000", 22);
        Artist matue = new Artist("Matue", "mat@gmail.com", "30praDois", "23389634545", "09/11/1999", 23);
        artistList.add(teto);
        artistList.add(matue);
        

        Music PayPal = Music.create(artistList, scanner);
        Music conexoes = Music.create(artistList, scanner);

        ArrayList<Music> musicas = new ArrayList<>();
        musicas.add(PayPal);
        musicas.add(conexoes);
                
        PayPal.print();
        conexoes.print();

        Playlist trintaPraUm = new Playlist(matue, "Melhores da 30praUm", musicas);

        trintaPraUm.print();
        scanner.close();
    }
}