import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject{
    private List<IObserver> users = new ArrayList<>();
    @Override
    public void notify(String message) {
        for (IObserver o : users) {
                o.update(message);
        }
    }

    @Override
    public void add(IObserver observer) {
        users.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        users.remove(observer);
    }
}
