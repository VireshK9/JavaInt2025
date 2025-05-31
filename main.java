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
//         float studentMarks = 75.25f;
//         char studentGrade = 'B';
//         boolean isPassed = true;

//         System.out.println(studentName);
//         System.out.println(studentId);
//         System.out.println(studentMarks);
//         System.out.println(studentGrade);
//         System.out.println(isPassed);
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

//Control Statements
// if else statement

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter your age : ");
//         int age = scanner.nextInt();
        
//         if (age >= 18) {
//             System.out.println("You are eligible to vote.");
//         } else {
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }


//if/else if/else statement
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the 24hr time : ");
//         int time = scanner.nextInt();

//         if(time>=0 && time<12){
//             System.out.println("Good Morning");
//         }
//         else if(time>=12 && time<16){
//             System.out.println("Good Afternoon");
//         }
//         else if(time>=16 && time<20){
//             System.out.println("Good Evening");
//         }
//         else if(time>=20 && time<24){
//             System.out.println("Good Night");
//         }
//         else{
//             System.out.println("Invalid Time");
//         }
//     }
// }

//Short hand if/else statement
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter your age : ");
//         int age = scanner.nextInt();

//         String result = (age>=30) ? "Rs.600" : "Rs.300";
//         System.out.println("Your ticket price is: " + result);
//     }
// }

//Switch case statement
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the day number of week : ");
//         int day = scanner.nextInt();

//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day number");
//         }
//     }
// }

// Nested if/else
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter your age : ");
//         int age = scanner.nextInt();

//         if(age>=60){
//             System.out.println("You have to pay Rs.600");
//         }
//         else if(age>=20){
//             System.out.println("Do you want a costume ?\n1.Yes\n2.No\n");
//             int choice = scanner.nextInt();
//             if(choice==1){
//                 System.out.println("Ticket = Rs.400\nCostume = Rs.200\nTotal = Rs.600");
//             }
//             else{
//                 System.out.println("Ticket = Rs.400\nCostume = Rs.0\nTotal = Rs.400");
//             }
//         }
//         else{
//             System.out.println("You have to pay Rs.200");
//         }
//     }
// }


// For loop

// public class main {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             System.out.println(i);
//             for(int j=100;j<=105;j++){
//                 System.out.println("  " + j);
//             }
//         }
//     }
// }

//Syntax of for loop
// for(initialization; condition; increment/decrement){
//     //code block
// }

// for each loop
// public class main {
//     public static void main(String[] args) {
//         String[] names = {"Omkar", "Shivam", "Sagar", "Siddharth", "Akash"};
        
//         for(String name : names){
//             System.out.print(name + " ");
//         }
//     }
// }

// while loop
// public class main {
//     public static void main(String[] args) {
//         int i = 1;
//         while(i<=10){
//             System.out.println(i);
//             i++;    //i = i + 1
//         }
//     }
// }

//do while loop
// public class main {
//     public static void main(String[] args) {
//         int i = 24;

//         do{
//             System.out.println(i);
//             i++;
//         }while(i<=10);
        
//     }
// }

// Break and continue statement
//break statement
// public class main {
//     public static void main(String[] args) {
//         int i = 0;
//         while(i<=10){
//             if(i==5){
//                 break;
//             }
//             System.out.println(i);
//             i++;
//         }
//     }
// }

//continue statement
// public class main {
//     public static void main(String[] args) {
//         int i = 0;
//         while(i<=10){
//             i++;
//             if(i==5){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// Arrays
// public class main {
//     public static void main(String[] args) {
//         int[] num = {1,2,3,4,5,6,7,8,9,10};  
        
//         System.out.println(num[5]);
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         String[] names = {"Omkar", "Shivam", "Sagar", "Siddharth", "Akash"};
//         // names[2] = "Raj";

//         // System.out.println(names[2]);
//         System.out.println(names.length);
//     }
// }


// looping through an array
// public class main {
//     public static void main(String[] args) {
//         String[] names = {"Omkar", "Shivam", "Sagar", "Siddharth", "Akash"};
//         for(int i=0;i<names.length;i++){
//             System.out.println(names[i]);
//         }
//     }
// }

// Multidimensional Arrays
// public class main {
//     public static void main(String[] args) {
//         // 2D Array
//         int[][] num = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         // Looping through a 2D array
//         for(int i=0;i<num.length;i++){
//             for(int j=0;j<num[i].length;j++){
//                 System.out.println(num[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }


