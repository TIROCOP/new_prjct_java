```java 
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        float n = in.nextFloat();
        double n = in.nextDouble();
        System.out.println(3.0 <= n && n <= 8.0);
    }
}
```
```java 
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        float n = in.nextFloat();
        double n = in.nextDouble();
        System.out.println((-3.0 <= n && n <= 5.0) || (9.0 <= n && n <= 15.0));
    }
}
```
```java 
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        float n = in.nextFloat();
        double n = in.nextDouble();
        System.out.println(!((-2.0 <= n && n <= 3.0) || (6.0 <= n && n <= 9.0)));
    }
}
```
```java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        float n = in.nextFloat();
        double n = in.nextDouble();
        System.out.println(n >= 100 && n< 1000 && n%5==0);
    }
}
```
```java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        float n = in.nextFloat();
        double n1 = Math.abs(in.nextDouble()),
                n2 = Math.abs(in.nextDouble()),
                n3 = Math.abs(in.nextDouble()),
                n4 = Math.abs(in.nextDouble());
        System.out.println(n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4);
    }
}
```
```java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int k = 0;
        if (n1 % 2 == 0) {
            ++k;
        }
        if (n2  % 2 == 0) {
            ++k;
        }
        if (n3 % 2 == 0) {
            ++k;
        }
        System.out.println(k >= 2);
    }
}
```