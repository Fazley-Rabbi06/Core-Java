package OOP;

public class TestBjit {
    public static void main(String[] args) {
        EngDepartment ed1 = new EngDepartment();
        ed1.displayInfo();
        ed1.addNewDept("Web",1);
        ed1.displayInfo();
        //If we omit one or two methods and try compiling it then error message will specifically list the required methods that have not been implemented.
    }
}
