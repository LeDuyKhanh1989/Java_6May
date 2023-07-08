package Manager;

import java.util.List;

public interface Manager <E>{
    public void add(E e);
    public void edit(String id, E e);
    public void delete(String id);
    public int findIndex(String id);
    public List<E> showall();

}
