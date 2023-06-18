package Khoi;

public interface Manage <E> {
    public void add();
    public void edit(int id);
    int findIndex(int id);
    public void delete(int id);

}
