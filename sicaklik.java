import java.util.Random;
public class Sicaklik implements ISicaklik {
    private int sicaklik;

    public Sicaklik(){
        Random rnd = new Random();
        sicaklik = rnd.nextInt(70);
    }

    public int SicaklikDondur(){
        return sicaklik;
    }
}
