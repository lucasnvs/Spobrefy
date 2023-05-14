import java.util.ArrayList;
import java.util.List;

import com.spobrefy.content.Music;
import com.spobrefy.users.*;

public class Sistema {
    public static void main(String[] args) {

        List<Artist> artistList = new ArrayList<>();

        Artist teto = new Artist("Teto", "teti@gmail.com", "30praUm", "2335345345", "10/10/2000", 22);
        Artist matue = new Artist("Matuê", "mat@gmail.com", "30praDois", "23389634545", "09/11/1999", 23);
        artistList.add(teto);
        artistList.add(matue);
        

        Music PayPal = Music.create(artistList);
        Music conexoes = Music.create(artistList);
        
        PayPal.print();
        conexoes.print();
    }
}