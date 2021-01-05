package org.kodluyoruz;

public class Queue<T> {

    ValueClass<T> first;
    ValueClass<T> last;

    public synchronized void add(T value) {
        ValueClass<T> node = new ValueClass(value);

        if (first == null) {
            first = node;
            last = node;
        }
        else{
            last.setValue2(node);
            last = node;
        }
    }

    public T peek(){
        if(first != null){ first.getValue();}
        else
        {
            first= null;
        }
        return first.getValue();
    }
    public synchronized T poll(){
        T value = null;
        if(first != null){
            ValueClass<T> node = first;
            first = first.getValue2();
            value = node.getValue();
        }
        return value;
    }
}
