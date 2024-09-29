package sept.Ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        int itemcode = 001;

        switch (itemcode){
            case 001 -> System.out.println("Its a laptop");
            case 002 -> System.out.println("Its a desktop");
            case 003,004 -> System.out.println("Its a mobile phone");

        }
    }
}
