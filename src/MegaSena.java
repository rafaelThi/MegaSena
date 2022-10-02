import java.util.ArrayList;
import java.util.Collections;

public class MegaSena {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 61; i++) {
           list.add(i);
        }
        Collections.shuffle(list);
        for (int indx = 0; indx < 6; indx++){
            System.out.println(list.get(indx));
        }
    }
}
