import com.spobrefy.users.*;

public class Sistema {
    public static void main(String[] args) {
            User usuario = new User("Carlos" ,"carlos@c.c", "sder845");
            Admin admin = new Admin("adm1", "Sam", "sam@s.com" , "sam123pastel", "05501692023" , "10/01/2004", 19);
            Artist artist = new Artist("Sam", "sam@s.com" , "sam123pastel", "05501692023" , "10/01/2004", 19);
            usuario.imprimir();
            System.out.println();
            admin.imprimir();
            System.out.println();
            artist.imprimir();
            System.out.println("teste");
        }
}

   