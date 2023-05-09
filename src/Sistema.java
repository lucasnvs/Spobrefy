import com.spobrefy.Music;
import com.spobrefy.users.*;

public class Sistema {
    public static void main(String[] args) {
        Artist hariel = new Artist("Mc Hariel", "haridade@email.com", "23ha2023", "023233453432", "20/04/2000", 23);
        Music musica1 = new Music("Pecado", hariel, 3.5);
        
        System.out.println(musica1.getAuthor().getNickname());
        System.out.println(musica1.getRating());
    }
}

   