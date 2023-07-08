package User;

public class User {
    private String account;
    private String Password;
    private int role;

    public User(String account, String password, int role) {
        this.account = account;
        Password = password;
        this.role = role;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", Password='" + Password + '\'' +
                ", role=" + role +
                '}';
    }
}
