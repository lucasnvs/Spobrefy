import com.spobrefy.users.*;

public class Sistema {
    public static void main(String[] args) {
            Admin admin = new Admin("adm1", "Sam", "sam@s.com" , "sam123pastel", "454565434" , "10/01/2004", 19);
            admin.print();
            Artist artist = Artist.create();
    }
}

   