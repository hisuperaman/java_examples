class myClass{

    private static void myPrint(){
        System.out.println("Private method");
    }

    static void callMyPrint(){
        myPrint();
    }

}

public class Main{
    public static void main(String[] args){
        myClass.callMyPrint();
    }
}