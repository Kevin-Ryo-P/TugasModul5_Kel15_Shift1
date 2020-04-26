package modul_5java;


public class userService {
    private String[][] data = new String[2][3];
    private String[][] histories = new String[2][4];
    private String email, password, roles = "";
    private String matkul1 = "", matkul2 = "", tanggal = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"AnaddaFerrellkelompok15@gmail.com", "12345", "supedAdmin"},
            {"KevinRyokelompok15@gmail.com", "12345", "user"} 
        };
        String[][] histories =
        {
            {"AnaddaFerrellkelompok15@gmail.com", "Fisika Dasar", "Dasar Komputer dan Pemrograman", "26-04-2020"},
            {"KevinRyokelompok15@gmail.com", "Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "26-04-2020"}
        };
        this.data = data;
        this.histories = histories;
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    matkul1 = histories[i][1];
                    matkul2 = histories[i][2];
                    tanggal = histories[i][3];
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            System.out.println("Meminjam Buku Perpustakaan UNDIP : ");
            System.out.println("[1] " + matkul1);
            System.out.println("[2] " + matkul2);
            System.out.println("Tanggal Pinjaman : " + tanggal);      
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}
