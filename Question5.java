import java.util.*;

public class Question5 {
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);  
    //System.out.println("");
    int numInput = in.nextInt();  
    List<Integer> lista = new ArrayList<Integer>();
    
    for (int i = 0; i < numInput; i++)
    {
        //Scanner objTwo = new Scanner(System.in);  
        //System.out.println("");
        int number = in.nextInt();  
        lista.add(number);
    }
    
    
    int maxValue = 0, maxCount = 0, x, y;
    int n = lista.size();
    for(x = 0; x < n; x++)
    {
      int count = 0;
      for(y = 0; y < n; y++)
      {
        if (lista.get(x) == lista.get(y))
        {
          count++;
        }
      }
      if (count > maxCount)
      {
        maxCount = count;
        maxValue = lista.get(x);
      }
      count = 0;
    }

    System.out.println(maxValue);
  }
    
}