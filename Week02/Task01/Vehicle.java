package codechef.java;

 class Vehicle {
    int speed;
    int fuel;

    Vehicle(int speed, int fuel){
        this.speed=speed;
        this.fuel=fuel;
    }

    void displayDetails(){
        System.out.println("Vehicle speed"+" "+speed +"kh/h");
        System.out.println("Vehicle fuel"+" "+fuel+"liters");
    }
}
class Car extends Vehicle{
    String model;
    Car(int speed, int fuel, String model){
        super(speed,fuel);
        this.model=model;
    }
    void displayDetails(){
        System.out.println("Car model"+" "+ model);
        System.out.println("Car speed"+" "+speed+" km/h");
        System.out.println("Car fuel"+" "+ fuel+ " liters");
    }
}
class Bike extends Vehicle{
    String type;
    Bike(int speed ,int fuel,String type){
        super(speed,fuel);
        this.type=type;
    }
    void displayDetails(){
        System.out.println("Bike type  "+type);
        System.out.println("Bike speed  "+speed+" km/h");
        System.out.println("Bike fuel  "+fuel+" liters");
    }
}
 class Machine{
    public static void main(String[] args){
        Car cr=new Car(180,50,"BMW");
        Bike bk=new Bike(150,40, "Bolero");
        cr.displayDetails();
        System.out.println();
        bk.displayDetails();
    }
}
