public class MerkezIslemBirimi {
    private boolean ackikMi = false;

    public MerkezIslemBirimi(){
        Eyleyici eyleyici = new Eyleyici();
    }

    public void EyleyiciCalistir(String state){
        Eyleyici eyleyici = new Eyleyici();

        System.out.println("Seçiminiz eyleyiciye iletiliyor...");
        try {
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }

        if(state.equals("Aç")){
            eyleyici.SogutucuAc();
            ackikMi = true;
        }
        else if (state.equals("Kapat")){
            eyleyici.SogutucuKapa();
            ackikMi = false;
        }
    }

    public boolean SogutucuAcikMi(){
        if(ackikMi){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean SogutucuKapaliMi(){
        if(ackikMi){
            return false;
        }
        else{
            return true;
        }
    }
}
