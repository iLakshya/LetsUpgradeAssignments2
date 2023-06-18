public class ME
{
    public static int majorityElement(int[] array)
    {
        int count = 0;
        int candidate = array[0];
        for(int element : array)
        {
            if(count == 0)
            {
                candidate = element;
                count = 1;
            }
            else if(element == candidate)
            {
                count ++;
            }
            else
            {
                count --;
            }
        }
        return count > 0 ? candidate : -1;
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 3, 3, 2, 1};
        int majorityElement = majorityElement(array);
        System.out.println(majorityElement);
    }
}