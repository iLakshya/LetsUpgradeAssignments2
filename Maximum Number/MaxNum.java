import java.util.Scanner;
public class MaxNum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        int maxNumber = array[0];
        int maxIndex = 0;
        for(int i=1;i<size;i++)
        {
            if(array[i] > maxNumber)
            {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        System.out.println("The maximum number in the array is: " + maxNumber + " and the maximum index in the array is: " + maxIndex);
    }
}