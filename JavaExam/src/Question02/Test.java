package Question02;

import java.util.*;

    public class Test {
        public static void main(String[] args) {
            List<Employees> employeeList =new ArrayList<>();

            employeeList.add(new Employees(11,"Rabbi","java",6000));
            employeeList.add(new Employees(13,"Rakib","sqa",2600));
            employeeList.add(new Employees(15,"Sakib","blockchain",7000));
            employeeList.add(new Employees(16,"Emdad","php",5000));
            employeeList.add(new Employees(17,"Hasan","js",6600));
            employeeList.add(new Employees(19,"Jasan","python",7600));


            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Category : for id press 1, for department press 2 , for all press 3  and 4 for add employee:");
            String input = scan.nextLine();
            System.out.println("Enter sort order-asc for ascending order and desc for descending order :");
            String order = scan.nextLine();
            switch (input) {
                case "1":
                    System.out.println("sorting by id");
                    sortById(order, employeeList);
                    break;
                case "2":
                    System.out.println("sorting by department");
                    sortByDept(order, employeeList);
                    break;
                case "3":
                    System.out.println("sorting by all");
                    sortByAll(order, employeeList);
                    break;
                case "4":
                    System.out.println("Add employee");
                    addEmployee(employeeList);
                    break;
                default:
                    System.out.println("invalid input");
            }


        }
        public static void sortById(String order,List<Employees> emplist){
            Collections.sort(emplist);
            for(Employees s:emplist){
                System.out.println(s.id+"  "+s.name+"  "+s.department+"  "+s.salary);
            }

        }

        public static void sortByDept(String order,List<Employees> emplist){
            if(order.equals("asc")) {
                Collections.sort(emplist, Comparator.comparing(Employees::getDepartment));
                for (Employees s : emplist) {
                    System.out.println(s.id + "  " + s.name + "  " + s.department + "  " + s.salary);
                }
            }
            else if(order.equals("desc")){
                Collections.sort(emplist, Comparator.comparing(Employees::getDepartment).reversed());
                for (Employees s : emplist) {
                    System.out.println(s.id + "  " + s.name + "  " + s.department + "  " + s.salary);
                }
            }
        }

        public static void sortByAll(String order,List<Employees> emplist){
            if (order.equals("asc")){
                Collections.sort(emplist, Comparator.comparing(Employees::getDepartment).thenComparing(Employees::getName).thenComparing(Employees::getId));
                for(Employees s:emplist){
                    System.out.println(s.id+"  "+s.name+"  "+s.department+"  "+s.salary);
                }
            }
            else if(order.equals("desc")){
                Collections.sort(emplist, Comparator.comparing(Employees::getDepartment).reversed().thenComparing(Employees::getName).reversed().thenComparing(Employees::getId).reversed());
                for(Employees s:emplist){
                    System.out.println(s.id+"  "+s.name+"  "+s.department+"  "+s.salary);
                }
            }

        }

        public static void addEmployee(List<Employees> emplist){
            boolean flag=true;
            Scanner in = new Scanner(System.in);
            int id = in.nextInt();
            String name = in.next();
            String dept = in.next();
            double salary = in.nextDouble();
            Employees s = new Employees(id, name,dept, salary);


            for(Employees e:emplist){
                if (e.id==id){
                    flag=true;
                }
                else{
                    flag=false;
                }
            }
            if(flag==false){
                System.out.println("can’t allow to add new employee with existed employeeId");
            }
            else if(flag==true) {
                emplist.add(s);
                for(Employees s1:emplist){
                    System.out.println(s1.id+"  "+s1.name+"  "+s1.department+"  "+s1.salary);
                }
            }
        }
    }

