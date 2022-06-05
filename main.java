import java.util.Arrays;

class Main {
  public static void main(String[] args) {

      int A[] = {2, 4, 7, 13, 14, 15, 16};
      int B[] = {1, 6, 7, 11, 13, 16, 18};
      int C[] = concatenar(A, B);
      int e[] = diferenca(A, B);
      
      System.out.println(Arrays.toString(c));
      
      System.out.println(Arrays.toString(e));
  }
    
  public static int[] concatenar(int[] a, int[] b) {
      int c[] = new int[a.length + b.length];
      int k[] = 0;

      for (int i = 0; i < a.length; i++)
          c[k++] = a[i];
      
      for (int i = 0; i < b.length; i++)
          c[k++] = b[i];

      return c;      
  }

  public static int[] diferenca(int[] a, int []b) {
        
        var apenasNoa = a.filter(function (element, index, array) {
            if(b.indexOf(element) == -1)
                return element;
        });

        var apenasNob = b.filter(function (element, index, array) {
            if(a.indexOf(element) == -1)
                return element;
        });

        e = apenasNoa.concat(apenasNob);

        return e;
    }
}