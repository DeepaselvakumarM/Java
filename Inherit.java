// class College{
//     String collegeName="ABC Engineering college";
//     void show(){
//         System.out.println(collegeName);
//     }
// }
// class Department extends College{
//     String depName="CSE";
//     void dep(){
//         System.out.println(depName);
//     }
// }

// public class Inherit{
//     public static void main(String[] args) {
//         Department dep=new Department();
//         dep.show();
//     }
// }

class College{
    String college="ABC Engineering College";
    void show(){
        System.out.println(college);
    }
}


class Department extends College{
    String departmentName = "Computer Science";

    void showDepartment() {
        System.out.println("Department Name: " + departmentName);
    }
}
class Proffessor extends Department{
    String professorName = "Dr. John Smith";
    void showProfessor() {
        System.out.println("Professor Name: " + professorName);
    }
}

public class Inherit{
    public static void main(String[] args) {
        Proffessor prof=new Proffessor();
        prof.showDepartment();
    }
}