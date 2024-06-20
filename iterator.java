//

//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        Iterator<String> it = cars.iterator();
        System.out.println(it.next());
    }
}
