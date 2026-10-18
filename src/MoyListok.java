public class MoyListok<T>{
    private Object[] el;
    private int size;

    public MoyListok(){
        el = new Object[10];
        size = 0;
    }

    public void add(T element){
        if(size == el.length){
            obn();
        }
        el[size++] = element;
    }

    public int size(){
        return size;
    }

    public T del(int index){
        T d = (T) el[index];

        for(int i = index; i<size - 1; i++){
            el[i] = el[i+1];
        }
        el[--size] = null;
        return d;
    }

    private void obn(){
        Object[] newarr = new Object[el.length * 2];
        for(int i = 0; i < size; i++){
            newarr[i] = el[i];
        }
        el = newarr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(el[i]);
            if (i < size - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }
}