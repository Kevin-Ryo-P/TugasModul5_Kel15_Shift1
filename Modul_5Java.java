package modul_5java;

import java.util.Scanner;

public class Modul_5Java {

    public static void main(String[] args) {
        String email, password;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService panggil = new userService( email, password );
        panggil.login();
}
}