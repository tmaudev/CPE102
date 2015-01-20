/**
 * Creates Linked List
 *
 * @author Tyler Mau
 * @version Program 06
 */

import java.lang.Iterable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BasicLinkedList<E> implements BasicList<E>, Iterable<E>
{
   private Node<E> head;
   private int count;

   public BasicLinkedList()
   {
      head = new Node<E>();
      head.next = head;
      head.previous = head;
      count = 0;
   }

   private class Node<E>
   {
      public E element;
      public Node<E> next;
      public Node<E> previous;
   }

   private class It implements BasicListIterator<E>
   {
      private Node<E> cur = head;
      public boolean hasNext()
      {
         return (cur.next != head);
      }

      public E next()
      {
         if(!hasNext())
         {
            throw new NoSuchElementException();
         }
         cur = cur.next;
         return cur.element;
      }

      public boolean hasPrevious()
      {
         return (cur.next.previous != head);
      }

      public E previous()
      {
         if(!hasPrevious())
         {
            throw new NoSuchElementException();
         }
         E elem = cur.element;
         cur = cur.previous;
         return elem;
      }

      public void remove()
      {
         throw new UnsupportedOperationException();
      }
   }

   public void add(E element)
   {
      Node<E> temp = new Node<E>();
      temp.element = element;
      temp.next = head;
      temp.previous = head.previous;
      head.previous.next = temp;
      head.previous = temp;
      count++;
   }

   public void add(int index, E element)
   {
      if(index < 0 || index > count)
      {
         throw new IndexOutOfBoundsException();
      }
      int i = 0;
      Node<E> temp = new Node<E>();
      temp = head;
      for(i=0; i<=index; i++)
      {
         temp = temp.next;
      }
      Node<E> node = new Node<E>();
      node.element = element;
      node.previous = temp.previous;
      node.next = temp;
      temp.previous.next = node;
      temp.previous = node;
      count++;
   }

   public BasicListIterator<E> basicListIterator()
   {
      return new It();
   }

   public void clear()
   {
      head.next = head;
      head.previous = head;
      count = 0;
   }

   public boolean contains(E element)
   {
      int i = 0;
      Node<E> temp = head;
      for(i=0; i<count; i++)
      {
         temp = temp.next;
         if(element == null && temp.element == null)
         {
            return true;
         }
         if(temp.element.equals(element))
         {
            return true;
         }
      }
      return false;
   }

   public E get(int index)
   {
      if(index < 0 || index > count-1)
      {
         throw new IndexOutOfBoundsException();
      }
      int i = 0;
      Node<E> temp = new Node<E>();

      temp = head;
      for(i=0; i<=index; i++)
      {
         temp = temp.next;
      }
      return temp.element;
   }

   public int indexOf(E element)
   {
      int i = 0;
      Node<E> temp = new Node<E>();
      temp = head;
      for(i=0; i<count; i++)
      {
         temp = temp.next;
         if(element == null && temp.element == null)
         {
            return i;
         }
         if((temp.element).equals(element))
         {
            return i;
         }
      }
      throw new NoSuchElementException();
   }

   public Iterator<E> iterator()
   {
      return new It();
   }

   public E remove(int index)
   {
      if(index < 0 || index > count-1)
      {
         throw new IndexOutOfBoundsException();
      }
      int i = 0;
      Node<E> temp = new Node<E>();
      temp = head;
      for(i=0; i<=index; i++)
      {
         temp = temp.next;
      }

      E element = temp.element;
      temp.previous.next = temp.next;
      temp.next.previous = temp.previous;
      count--;
      return element;
   }

   public E set(int index, E element)
   {
      if(index < 0 || index > count-1)
      {
         throw new IndexOutOfBoundsException();
      }
      int i = 0;
      Node<E> temp = new Node<E>();

      temp = head;
      for(i=0; i<=index; i++)
      {
         temp = temp.next;
      }

      E elem = temp.element;
      temp.element = element;
      return elem;
   }

   public int size()
   {
      return count;
   }
}
