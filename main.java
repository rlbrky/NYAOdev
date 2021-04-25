/* @Author Berkay
    NYA ODEV MAIN
*/
public class main {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici();
        Publisher publisher = new Publisher();

        publisher.add(kullanici);

        Giris giris = new Giris();
        giris.Login();
    }
}
