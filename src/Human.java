public class Human {
    String name;
    int birthYear;
    int maxAge;

    public Human(){
        name="no name";
        birthYear=2000;
        maxAge=100;
    }

    public Human(String n, int b,int a){
        name=n;
        birthYear=b;
        maxAge=a;
    }

    public void smoke(int numOfCigarettes){

        maxAge-=2*numOfCigarettes;

    }

    public void exercise(int numOfHours){
        maxAge+= numOfHours/300;

    }

    public void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Year of birth:"+birthYear);
        System.out.println("Maximum age:"+maxAge);

    }
}