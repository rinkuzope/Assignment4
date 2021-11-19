import java.util.*;
/*public class lcmOfThree {
    public static void main(String[] args) {
        int a,b,c,g,p,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 digits t find lcm:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(a + " " + b + " " + c);
        p = a*b*c;
        g= a>b && a> c ? a:b > c ? b:c;
        for ( i =g; i <= p; i+=g)
        {
            if(i%a == 0 && i%b == 0 && i%c==0 )
            {
                break;
            }
        }
        System.out.println(i);
    }
}

 */
public class lcmOfThree{
    static int getLcm(int a, int b, int c) {
        int lcm = Math.max(Math.max(a, b), c);

        while(true) {
            if (lcm % a == 0 && lcm % b == 0 && lcm % c == 0) {
                return lcm;
            }
            lcm++;
        }
    }
    public static void main(String args[]) {
        int a = 12, b = 15, c = 40;

        System.out.format("The LCM (Least Common Multiple) is: %d\n", getLcm(a, b, c));
    }
}

