/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */

class OrderedItem {
    String Name;
    Comparable Priority;
    OrderedItem Next;

    public OrderedItem(String name, int priority, OrderedItem next) {
        this.Name = name;
        this.Priority = priority;
        this.Next = next;
    }

}
