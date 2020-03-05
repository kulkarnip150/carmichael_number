import java.util.*;

class carmichael_number {
  public static void main(final String[] args) {
    findcarmichael();
  }

  public static void findcarmichael() {
    final Scanner sc = new Scanner(System.in);
    int n, g=0,i=2;
    double power;
    System.out.println("enter number");
    n = sc.nextInt();
    while(i<=n){
      g = gcd(n,i);
      if(g==1){
        break;
      }
      i++;
    }
    power=Math.pow(i,n-1);
    System.out.println();
    if(power%n==1){
      System.out.println(n+" is carmichael");
    }
    else{
      System.out.println(n+" is not carmichael");
    }
    sc.close();
  }

  public static int gcd(int a,int g) {
      while(g!=a){
        if(g<a){
          a=a-g;
        }
        else{
          g=g-a;
        }
      }
      return g;
    }
  }