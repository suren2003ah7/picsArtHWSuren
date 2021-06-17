package com.company.classwork;

public class MyArrayList<T> implements MyList<T> {
    private static final int CAPACITY = 4;
    private Object[] data;

    private int size;
    private int index;

    public MyArrayList(){
        data = new Object[CAPACITY];
        size = CAPACITY;
    }


    @Override
    public void add(T obj) {
        if (index == size - 1)
            increaseSize();

        data[index++] = obj;
    }

    private void increaseSize() {
            size += CAPACITY;
            Object[] newData = new Object[size];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int i) {
        checkIndex(i);
        return (T) data[i];
    }

    private void checkIndex(int i){
        if (i < 0 || i >= index){
            throw new IndexOutOfBoundsException("Invalid index for MyList");
        }
    }

    @Override
    public void remove(int i) {
        checkIndex(i);
        for (int j = i; j < index - 1; j++) {
            data[j] = data[j + 1];
        }
        data[index - 1] = null;
        index--;
    }

    @Override
    public void remove(T obj) {
        for (int i = 0; i < index; i++){
            if (obj != null){
                if (obj.equals(data[i])){
                    remove(i);
                    break;
                }
            }
            else if (data[i] == null){
                remove(i);
                break;
            }
        }
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < index; i++) {
            sb.append(data[i]);
            if (i != index - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
