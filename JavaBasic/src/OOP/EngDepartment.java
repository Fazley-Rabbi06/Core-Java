package OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class EngDepartment extends BJITLimited{
    int noOfDept = 10;
    ArrayList<String> deptNames = new ArrayList<>(Arrays.asList("Devops","Valmet"));

    void addNewDept(String name, int numberOfNewDept){
       deptNames.add(name);
       noOfDept = noOfDept + numberOfNewDept;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Total No of Dept = "+noOfDept+"\nDepartment Name : "+deptNames+"\n");
    }


}
