package Main;

import javax.security.auth.Subject;

public interface MainFunction <E> {
    public E[] add();
    public E[] edit(int id);
    public void show();
    public void delete(int id);



}
