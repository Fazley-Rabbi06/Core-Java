package Collection;

public class Student {
     Integer id;
     String name;
     String className;
     Integer rollNo;

    public Student(Integer id, String name, String className, Integer rollNo) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.rollNo = rollNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
