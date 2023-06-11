package com.spobrefy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.spobrefy.content.Music;
import com.spobrefy.content.Playlist;
import com.spobrefy.users.*;

public class Sistema {
    public Scanner scan = new Scanner(System.in); 
    public ArrayList<User> allUsers;

    public Sistema() {
        this.allUsers = new ArrayList<>();
    }

    private void addUser(User u) {
        this.allUsers.add(u);
    }

    public void registerUser() {
        User user = User.create(this.scan);
        this.addUser(user);
        System.out.println("=======================================================================");
        System.out.println("CONTA REGISTRADA COM SUCESSO!");
        System.out.println("=======================================================================");
    }

    private boolean loginVerify(String nick, String pass) {
        for (User user : allUsers) {
            if (user.getNickname().equals(nick) && user.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public Boolean login() {

            Integer aux;
            System.out.println("LOGIN DE USUÁRIO:");
            System.out.println("=======================================================================");
            System.out.println("+ Qual o seu nickname?");
            String nick = this.scan.nextLine();
            System.out.println("+ Qual sua senha?");
            String pass = this.scan.nextLine();

            if(!loginVerify(nick, pass)) {
                System.out.println("=======================================================================");
                System.out.println("SENHA OU NICKNAME INCORRETOS!");
                System.out.println("=======================================================================");
                System.out.println("| Deseja tentar novamente?\n| 1 - Tentar novamente\n| 2 - Desistir...");
                System.out.println("=======================================================================");
                aux = this.scan.nextInt();

                if(aux == 1) {
                    this.scan.nextLine();
                    login();
                }
                return false;
            }
            
            System.out.println("=======================================================================");      
            System.out.println(String.format("LOGADO COM SUCESSO! SEJA BEM VINDO DE VOLTA %s", nick));
            System.out.println("=======================================================================");
            return true;
    }

    public static void main(String[] args) {
        // testes
        Sistema sistema = new Sistema();

        // Scanner scanner = sistema.scan;
        // List<Artist> artistList = new ArrayList<>();

        // User lukinhas222 = new User("lukinhas222", "l@l.com", "pastel2020");
        // Artist teto = new Artist("Teto", "teti@gmail.com", "30praUm", "2335345345", "10/10/2000", 22);
        // Artist matue = new Artist("Matue", "mat@gmail.com", "30praDois", "23389634545", "09/11/1999", 23);
        // artistList.add(teto);
        // artistList.add(matue);
        
        // sistema.addUser(teto);
        // sistema.addUser(matue);
        // sistema.addUser(lukinhas222);

        Menu menu = new Menu();
        menu.init(sistema);

        // Music PayPal = new Music("PayPal", teto);
        // Music conexoes = new Music("Conexões de Máfia", matue);

        // ArrayList<Music> musicas = new ArrayList<>();
        // musicas.add(PayPal);
        // musicas.add(conexoes);
                
        // PayPal.print();
        // conexoes.print();

        // Playlist trintaPraUm = new Playlist(matue, "Melhores da 30praUm", musicas);

        // lukinhas222.addPlaylist(trintaPraUm);
        // trintaPraUm.print();
        // lukinhas222.print();
        
        // scanner.close();
    }
}