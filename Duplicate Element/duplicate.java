import java.util.*;
public class duplicate
{
    public static ArrayList<Integer> findDuplicates(int[] array)
    {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int element : array)
        {
            if(seen.contains(element))
            {
                duplicates.add(element);
            }
            else
            {
                seen.add(element);
            }
        }
        return duplicates;
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 3, 2, 1};
        ArrayList<Integer> duplicates = findDuplicates(array);
        System.out.println(duplicates);
    }
}
