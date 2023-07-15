import java.util.*;
public class AnagramChecker
{
    public static boolean isAnagram(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toLowerCase().toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toLowerCase().toCharArray())
        {
            int count = map.get(c);
            if (count == 0)
            {
                return false;
            }
            else
            {
                map.put(c, count - 1);
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
        str1 = "restful";
        str2 = "fluster";
        System.out.println(isAnagram(str1, str2));
    }
}
