/**
 * Interface for BasicLinkedList declares methods.
 *
 * @author Tyler Mau
 * @version Program 06
 */

public interface BasicList<E>
{
   public void add(E element);
   public void add(int index, E element);
   public void clear();
   public boolean contains(E element);
   public Object get(int index);
   public int indexOf(E element);
   public Object remove(int index);
   public Object set(int index, E element);
   public int size();
}
