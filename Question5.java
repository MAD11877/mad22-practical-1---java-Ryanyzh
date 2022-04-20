import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question5
{
  static int mode(List<Integer> a)
  {
    int maxValue = 0, maxCount = 0, x, y;
    int n = a.size();
    for(x = 0; x < n; x++)
    {
      int count = 0;
      for(y = 0; y < n; y++)
      {
        if (a.get(y) == a.get(x))
        {
          count++;
        }
      }
      if (count > maxCount)
      {
        maxCount = count;
        maxValue = a.get(x);
      }
    }
    return maxValue;
  }
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numInput = in.nextInt();
    ArrayList<Integer> lista = new List<>();

    for(int i = numInput; i > 0; i--)
    {
      Scanner input = new Scanner(System.in);
      int number = input.nextInt();
      lista.add(number);
    }

    System.out.println(mode(lista));
    
  }
}
