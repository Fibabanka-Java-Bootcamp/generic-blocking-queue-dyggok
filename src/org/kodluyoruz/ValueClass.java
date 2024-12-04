package org.kodluyoruz;

public class ValueClass<T> {
    private T value;
    private ValueClass<T> value2;

    public ValueClass(T value){
        this.value = value;

    }
    public ValueClass(ValueClass<T> value2){

        this.value2 = value2;

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ValueClass<T> getValue2() {
        return value2;
    }

    public void setValue2(ValueClass<T> value2) {
        this.value2 = value2;
    }
}
