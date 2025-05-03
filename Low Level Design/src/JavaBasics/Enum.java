package JavaBasics;

public enum Enum {
    RED,
    GREEN,
    BLUE;
    public static void main(String  args[]){
        String val="BLUE";
        Enum color=Enum.valueOf(val);
        System.out.println(color);
    }
}
