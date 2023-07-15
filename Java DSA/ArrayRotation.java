import java.util.Arrays;

public class ArrayRotation
{
    public static void rotateArray(int[] array, int rotationCount)
    {
        if (rotationCount < 1)
        {
            throw new IllegalArgumentException("Rotation count must be positive");
        }
        int[] rotatedArray = new int[array.length];
        for (int i = 0; i < rotationCount; i++)
        {
            rotatedArray[i] = array[array.length - rotationCount + i];
        }
        for (int i = rotationCount; i < array.length; i++)
        {
            rotatedArray[i] = array[i - rotationCount];
        }
        array = rotatedArray;
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int rotationCount = 2;
        System.out.println("Original array: " + Arrays.toString(array));
        rotateArray(array, rotationCount);
        System.out.println("Rotated array: " + Arrays.toString(array));
    }
}