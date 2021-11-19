import java.util.Scanner;
class removezero{
    public static String removeLeadingZero(String str)
    {
        String pattern = "0";
        str = str.replaceAll(pattern,"");
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num = sc.next();
        String result = removezero.removeLeadingZero(num);
        System.out.println(result);

    }

}