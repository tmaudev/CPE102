/**
 * Interface for BasicArrayList declares methods.
 *
 * @author Tyler Mau
 * @version Program 02
 */

public interface BasicList
{
   public void add(int index, Object element);
   public void add(Object element);
   public void clear();
   public boolean contains(Object element);
   public Object get(int index);
   public int indexOf(Object element);
   public Object remove(int index);
   public Object set(int index, Object element);
   public int size();
}
