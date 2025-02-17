package szamalk.hu.modell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Garazs implements Iterable {
    private LinkedList<Auto> autok;

    public Garazs(){
        autok.add(new Auto("BMW-001"));
        autok.add(new Auto("KIA-002"));
        autok.add(new Auto("BMW-003"));
        autok.add(new Auto("KIA-004"));
        autok.add(new Auto("BMW-005"));
        autok.add(new Auto("BMW-006"));

    }


    @Override
    public String toString() {
        return "Garazs{" +
                "autok=" + autok +
                '}';
    }

    public List<Auto> getAutok(){
        return new ArrayList<>(autok);
    }
    @Override
    public Iterator<Auto> iterator() {
        return autok.iterator();
    }
}
