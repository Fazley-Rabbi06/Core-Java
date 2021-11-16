package OOP;

public class BJITLimited {

    static String headOfficeAddress = "Plot No- 2740 & 2745 Pachkhola";
    static String ceoName = "Akbar JM ";
    private int noOfEmployee = 600;

    public int setEmployee(int newEmp){
        noOfEmployee = noOfEmployee + newEmp;
        return noOfEmployee;
    }
    public int getEmployee(){
        return noOfEmployee;
    }

    void displayInfo(){
        System.out.println("Head Office Address : "+headOfficeAddress+"\nCEO : "+ceoName+"\nTotal Employee : "+noOfEmployee);
    }
}
