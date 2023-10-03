```java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  DIGIT, если это однозначное неотрицательное число;
        //  NUM, если это двузначное число положительное число;
        //  OTHER, если оно не относится к первым двум категориям.
        int n = in.nextInt();
        if (n >= 0 && n < 10) {
            System.out.println("DIGIT");
        } else if (n >= 10 && n < 100) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
```

```java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt(), n2 = in.nextInt(), n3 = in.nextInt();
        if (n1 <= n2 && n1 <= n3) {
            System.out.print(n1 + " ");
            if (n2 < n3) {
                System.out.println(n2 + " " + n3);
            } else {
                System.out.println(n3 + " " + n2);
            }
        }
        if (n2 <= n1 && n2 <= n3) {
            System.out.print(n2 + " ");
            if (n1 < n3) {
                System.out.println(n1 + " " + n3);
            } else {
                System.out.println(n3 + " " + n1);
            }
        }
        if (n3 <= n2 && n3 <= n1) {
            System.out.print(n3 + " ");
            if (n2 < n1) {
                System.out.println(n2 + " " + n1);
            } else {
                System.out.println(n1 + " " + n2);
            }
        }

    }
}
```

```java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n = n1 % 10;
        if (n == 1 && n1 % 100 != 11) {
            System.out.println(n1 + " TORT");
        } else if ((n == 2 || n == 4 || n == 3) && n1 % 100 != 12 && n1 % 100 != 13 && n1 % 100 != 14) {
            System.out.println(n1 + " TORTA");
        } else {
            System.out.println(n1 + " TORTOV");
        }

    }
}
```

```java
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        if (A == 0) {
            if (B <= 0) {
                System.out.println("no such x");
            } else {
                System.out.println("any x");
            }
        } else {
            double deli = -B / A;
            deli = (double) Math.round(deli * 10) / 10;
            if (A < 0 && deli > 0) {
                // изменение знака <
                System.out.println((-deli) + "<x<" + deli);


            } else if (deli > 0) {
                System.out.println("x<" + (-deli) + " or x>" + deli);
            } else if (-B < 0 && deli < 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        }
    }
}
```