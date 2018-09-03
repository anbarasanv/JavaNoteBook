import java.util.*;
import java.text.*;
class Main {
  public static void main(String[] args) {
    int i = 10000000;
    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

    System.out.println("Indian "+nf.format(i));
    
  }
}
