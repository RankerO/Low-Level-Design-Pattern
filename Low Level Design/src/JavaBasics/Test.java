package JavaBasics;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Test {
    Day day;
    public Test(Day day){
        this.day=day;
    }
    public void today(){
        switch (day){
            case MONDAY:
                System.out.println("It is Monday");
                break;
            case TUESDAY:
                System.out.println("It is Tuesday");
                break;
            default:
                System.out.println("Neither Monday Nor Tuesday");
                break;
        }
    }
    public enum PhoneType{
        IPHONE,
        ANDROID,
        KEYPAD;
    }
    public static void main(String args[]){
        Enum c=Enum.BLUE;
        System.out.println(c);
        PhoneType type=PhoneType.IPHONE;
        System.out.println(type);

        //function
        Test test=new Test(Day.WEDNESDAY);
        test.today();

        for(Day day:Day.values()){
            System.out.print(day);
            System.out.print(" ");
        }
        System.out.println();
    }
}
