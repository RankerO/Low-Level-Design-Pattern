public class Main{
    public void fun(){
        System.out.println("calling fun....");
    }
    int y=1;
    public static void main(String []args){
        Main obj=new Main();
        System.out.println("Hello");
        obj.fun();
        System.out.println(obj.y);
    }
}