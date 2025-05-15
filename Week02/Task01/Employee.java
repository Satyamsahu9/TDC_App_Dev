package codechef.java;

abstract class Employee {
    String name;
    int id;
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    abstract double calculateSalary();
    public void displayInfo(){
        System.out.println("Name :"+"  "+name+" "+"id :"+" "+id);
    }
}
class FullTimeEmployee extends Employee{
    double monthSalary;
    public FullTimeEmployee(String name,int id,double monthSalary){
        super(name,id);
        this.monthSalary=monthSalary;
    }
    double calculateSalary(){
        return  monthSalary;
    }
}

class PartTimeEmployee extends  Employee{
    int daily_hour;
    double per_hour;

    public PartTimeEmployee(String name,int id,int daily_hour,double per_hour){
        super(name,id);
        this.daily_hour=daily_hour;
        this.per_hour=per_hour;
    }
    double calculateSalary(){
        return  daily_hour*per_hour;
    }
}
 class Main{
    public static void main(String[] args){
        FullTimeEmployee ft=new FullTimeEmployee("Satyam",12345,50000);
        ft.displayInfo();
        System.out.println(ft.calculateSalary());
        PartTimeEmployee pt=new PartTimeEmployee("sumit ",56780,5,150);
        pt.displayInfo();
        System.out.println(pt.calculateSalary());

    }
}
