public class StudentAccount extends Account {
    private int studentID;

    public StudentAccount(String username, String password, int studentID) {
        super(username, password);
        this.studentID = studentID;
    }

    @Override
    public void displayRole() {
        System.out.println("Student Account - ID: " + studentID);
    }
}

