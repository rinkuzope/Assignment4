import java.util.*;
public class transpose {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        System.out.print("Enter 2d matrix data:");
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<=1; i++)
        {
            for(int j=0; j<=1; j++)
            {
             a[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Given matrix is:");
        for(int i=0; i<=1; i++)
        {
            for(int j=0; j<=1; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");

        }
        System.out.println("Transpose of matrix:");
        for(int i=0; i<=1; i++)
        {
            for(int j=0; j<=1; j++)
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.print("\n");

        }
    }
}
