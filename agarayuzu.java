import java.util.Scanner;

public class AgArayuzu {
    public AgArayuzu(boolean kontrol){
        MerkezIslemBirimi merkezIslemBirimi = new MerkezIslemBirimi();
        Scanner scanner = new Scanner(System.in);
        String menu = "İşlem seçiniz \n" +
                "1. Soğutucuyu aç\n" +
                "2. Sıcaklık görüntüle\n" +
                "3. Soğutucuyu kapat\n" +
                "q. Çıkış yap.";
        String islem;
        loop:while (kontrol) {
            System.out.println(menu);
            islem = scanner.nextLine();
            switch (islem){
                case "1":
                    if(merkezIslemBirimi.SogutucuAcikMi()){
                        System.out.println("Soğutucu zaten açık...");
                    }
                    else{
                        merkezIslemBirimi.EyleyiciCalistir("Aç");
                    }
                    break;
                case "2":
                    Sicaklik sicaklik = new Sicaklik();
                    System.out.print("Sıcaklık : ");
                    System.out.println(sicaklik.SicaklikDondur() + " derece.");
                    break;
                case "3":
                    if(merkezIslemBirimi.SogutucuKapaliMi()){
                        System.out.println("Soğutucu zaten kapalı...");
                    }
                    else{
                        merkezIslemBirimi.EyleyiciCalistir("Kapat");
                    }
                    break;
                case "q":
                    System.out.println("Çıkış yapılıyor...");
                    try{
                        Thread.sleep(1000);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                    break loop;
                default:
                    System.out.println("Geçersiz işlem");
                    break;
            }
        }
    }
}
