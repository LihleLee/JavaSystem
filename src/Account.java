public abstract class Account {
    protected String username;
    protected String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract void displayRole();
}

