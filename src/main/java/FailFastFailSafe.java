import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastFailSafe {
    public static void main(String[] args)
    {
       List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(7);
        Iterator<Integer> iterator= list.iterator();
//        while (iterator.hasNext())
//        {
//            Integer number = iterator.next();
//            list.add(4);
//        }
    list.forEach(l-> list.remove(1) );
    }

}

