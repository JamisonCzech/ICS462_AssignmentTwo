import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */

/**
 * Class to implement the items into the Linked List
 * it also Extends LinkedList class for added functionality.
 */
public class OrderedList extends LinkedList {
    private int size;
    private OrderedItem head;
    private OrderedItem tail;

    public boolean addElement(OrderedItem newItem) {
        ListIterator<OrderedItem> itr = listIterator();

        if (this.isEmpty()) {
            this.add(newItem);
            return true;
        }
        
        while (true) {
            if (itr.hasNext() == false) {
                itr.add(newItem);
                return true;
            }

            OrderedItem nextItem = itr.next();
            if (nextItem.Priority.compareTo(newItem.Priority) > 0) {
                itr.previous();
                itr.add(newItem);
                return true;
            }
        }
    }
}

