public class Kullanici implements IObserver{
    public void update(String message){
        System.out.println("Kullanıcı : " + message);
    }
}
