public class slip19{

    public static void main(String[] args) {
      int[][] dataset = {{1, 5, 8},
          {4, 3, 1},
          {6, 5, 2}};
  
      System.out.println("Diagonal sum is " + DiagonalSum(dataset));
    }
  
    /**
    * Calculate the sum of diagonal elements.
    * @param a : 2-D array.
    * @return sum of diagonal elements.
    */
    private static int DiagonalSum(int[][] a) {
      int sum = 0;
      for (int i = 0; i < a.length; i++)
        for (int j = 0; j < a[0].length; j++) {
           // Check for main diagonal element.
           if (i == j) {
              sum += a[i][j];
           }
          
           // Check for secondary diagonal element.
           if (i + j == a.length - 1) {
              sum += a[i][j];
           }
         }
       return sum;
      }
  
  }
  