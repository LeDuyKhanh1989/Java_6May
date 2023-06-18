import java.util.ArrayList;

public class Mylist<Mylist> {
    private int size;
    private int default_capacity;

    public Mylist(int size, int default_capacity) {
        this.size = size;
        this.default_capacity = default_capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDefault_capacity() {
        return default_capacity;
    }

    public void setDefault_capacity(int default_capacity) {
        this.default_capacity = default_capacity;
    }
}
