public class AdminAccount extends Account {
    private int adminLevel;

    public AdminAccount(String username, String password, int adminLevel) {
        super(username, password);
        this.adminLevel = adminLevel;
    }

    @Override
    public void displayRole() {
        System.out.println("Admin Account - Level: " + adminLevel);
    }
}
