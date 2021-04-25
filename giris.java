import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Giris {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> userNames = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();
    Giris() {
        String query;
        database.connect();
        query = "select * from logindata";
        ResultSet rs = database.list(query);
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        try {
            while (rs.next()) {
                userName = rs.getString("kullaniciadi");
                password = rs.getString("sifre");
                userNames.add(userName);
                passwords.add(password);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
    public void Login () {
        String kullaniciAdi,sifre;
        boolean kontrol = false;
        int girisHakki = 3;
        while(true){
        System.out.print("Kullanıcı adı:");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Şifre:");
        sifre = scanner.nextLine();
        for(int i = 0; i < userNames.size();i++){
            if (kullaniciAdi.equals(userNames.get(i)) && sifre.equals(passwords.get(i))) {
                kontrol = true;
                break;
            }
        }

        if(kontrol) {
            System.out.println("Giriş başarılı!");
            AgArayuzu agArayuzu = new AgArayuzu(true);
            break;
        }else {
                System.out.println("Giriş başarısız.");
                girisHakki--;
            }
        if(girisHakki == 0){
            System.out.println("Giriş hakkınız kalmadı, program sonlanıyor...");
            break;
        }
    }
    }
}
