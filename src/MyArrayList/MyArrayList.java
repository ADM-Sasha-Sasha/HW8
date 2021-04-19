package MyArrayList;
import java.util.Iterator;

public class MyArrayList <E> implements Methods<E>{

    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(
                    temp, 0,
                    values, 0,
                    temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amoElAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp, index + 1, // от куда копируем
                    values, index, // куда
                    amoElAfterIndex); //сколько

        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E clear() {
        for (int i = 0; i<values.length; i++)
            values[i] = null;
        return null;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrIter<E>(values);
    }
}
