package ListeSinifi;

public class MyList <T>{
    int capacity;
    T[] list;
    T[] listTemp;
    int dimensionSize = 0;

    public void setList() {
        this.list = (T[]) new Object[this.capacity];
    }

    public void increaseCapacity() {
        this.listTemp = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.list.length; i++) {
            this.listTemp[i] = this.list[i];
        }
        this.list = this.listTemp;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.setList();
    }

    public MyList() {
        this.capacity = 10;
        this.setList();
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return this.dimensionSize;
    }
    public void sizeCalc() {
        int count = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                count++;
            }
        }
        this.dimensionSize = count;
    }

    public void add(T data) {
        if (this.size() < this.capacity){
            list[this.dimensionSize] = data;
            this.sizeCalc();
        } else {
            this.capacity = this.capacity * 2;
            this.increaseCapacity();
            this.add(data);
        }
    }
    @Override
    public String toString(){
        String elements="";
        for (T x: list)
            if(x != null)
              elements+=x+",";
        return "["+elements.substring(0, elements.length() > 0 ? elements.length()-1 : 0)+"]";
    }

    public T get(int idx) {
        T x = this.list[idx];
        return x;
    }

    public void remove(int idx) {
        replaceForRemove(idx);
        this.dimensionSize --;
    }

    public void replaceForRemove(int idx) {
        T[] listTemp2 = this.list;
        this.list[idx] = null;
        for (int i = 0; i < listTemp2.length-1; i++) {
            if (idx == 0) {
                this.list[i] = listTemp2[i + 1];
            } else if (idx != 0 && i<idx) {
                this.list[i] = listTemp2[i];
            } else if (idx != 0 && i>=idx) {
                this.list[i] = listTemp2[i + 1];
            }
        }
    }

    public void set(int idx, T data) {
        this.list[idx] = data;
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if(data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = this.list.length-1; i >= 0 ; i--) {
            if(data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty() {
        if (this.size() == 0) return true;
        else return false;
    }

    public Object[] toArray() {
        Object[] tempObject = new Object[this.list.length];
        for (int i = 0; i < this.list.length; i++) {
            tempObject[i] = this.list[i];
        }
        return tempObject;
    }

    public MyList<T> subList(int x, int y) {
        MyList<T> sub = new MyList<>(y - x + 1);
        //T[] sub = (T[]) new Object[this.capacity];
        for (int i = x; i <= y; i++) {
            sub.add((T) this.list[i]);
        }
        return sub;
    }

    public boolean contains(T data) {
        return indexOf(data)!=-1;
    }
    public void clear() {
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] = null;
        }
    }
}
