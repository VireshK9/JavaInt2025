// public class main {
//     public static void main(String args[]) {
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("*****");
//     }
// }

//Variables

// public class main {
//     public static void main(String args[]) {
//         String studentName = "John Doe";
//         int studentId = 15;
//         int studentAge = 23;
//         float studentMarks = 75.25f;
//         char studentGrade = 'B';

//         System.out.println(studentName);
//         System.out.println(studentId);
//         System.out.println(studentAge);
//         System.out.println(studentMarks);
//         System.out.println(studentGrade);
//     }
// }

// Type casting
// public class main {
//     public static void main(String args[]) {
//         double x = 7.84d;
//         int num = (int) x;

//         System.out.println(x);
//         System.out.println(num);
//     }
// }

//Operator
//Arithmetic Operator - + , - , * , / , %
// public class main {
//     public static void main(String args[]) {
//         int a = 20;
//         int b = 10;

//         System.out.println(a+b); //30
//         System.out.println(a-b); //10
//         System.out.println(a*b); //200
//         System.out.println(a/b); //2
//         System.out.println(a%b); //0
//     }
// }


//Comparison Operators - > , < , >= , <= , == , !=
// public class main {
//     public static void main(String args[]) {
//         int a = 20;
//         int b = 10;

//         System.out.println(a>b);
//         System.out.println(a<b);
//         System.out.println(a>=b);
//         System.out.println(a<=b);
//         System.out.println(a==b);
//         System.out.println(a!=b); 
//     }
// }

//Logical Operators - && , || , !
// AND Operator - &&
// public class main {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         int d = 40;

//         System.out.println((a<b)&&(c<d)); //true
//         System.out.println((a<b)&&(c>d)); //false
//         System.out.println((a>b)&&(c>d)); //false
//     }
// }


//Or operator - ||
// public class main {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         int d = 40;

//         System.out.println((a<b)||(c<d)); //true
//         System.out.println((a<b)||(c>d)); //true
//         System.out.println((a>b)||(c>d)); //false
//     }
// }

//Not operator - !
// public class main {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 20;

//         System.out.println(!(a<b)); //false
//         System.out.println(!(a>b)); //true
//     }
// }

//  public class main {
//     public static void main(String args[]) {
//         String userName = "Coding";

//         System.out.println(userName.length());
//     }
// }

//  public class main {
//     public static void main(String args[]) {
//         String userName = "Coding";

//         System.out.println(userName.toUpperCase());
//         System.out.println(userName.toLowerCase());
//     }
// }

// public class main {
//     public static void main(String args[]) {
//         String userName = "Coding Circle";

//         System.out.println(userName.indexOf("Circle"));
//     }
// }


//String Contination
// public class main {
//     public static void main(String args[]) {
//         String fname = "Omkar";
//         String lname = "Jadhav";

//         // System.out.println(fname + " " + lname);
//         System.out.println(fname.concat(lname));
//     }
// }

// Math functions in Java
// public class main {
//     public static void main(String args[]) {
//         // System.out.println(Math.max(5,8));
//         // System.out.println(Math.min(5,8));
//         // System.out.println(Math.sqrt(64));
//         // System.out.println(Math.random()); // 0.0 - 0.9

//         int random = (int)(Math.random() * 101);
//         System.out.println(random);
//     }
// }

//Taking user input using scanner
//Scanner Class
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         //Object 
//         Scanner scanner = new Scanner(System.in);

//         //String
//         System.out.println("Enter your name : ");
//         String name = scanner.nextLine();

//         System.out.println("Good Morning "+ name);
//         scanner.close();
//     }
// }