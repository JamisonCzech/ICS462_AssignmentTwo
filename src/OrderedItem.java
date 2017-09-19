/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 * (jamisonczech@gmail.com) </A>
 */

/**
 * class to create an object to insert into ordered linked list
 */
class OrderedItem {
    String Name;
    Comparable Priority;
    OrderedItem Next;

    /**
     * Constructor for class {@link OrderedItem}
     * @param name to insert into linked list
     * @param priority number into insert into linked list
     * @param next Object to insert
     */
    public OrderedItem(String name, int priority, OrderedItem next) {
        this.Name = name;
        this.Priority = priority;
        this.Next = next;
    }
}
