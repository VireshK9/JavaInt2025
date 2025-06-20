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


// public class main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int c = 30;

//         int x,y,z;
//         x = 100;
//         y = 200;
//         z = 300;

//         int i,j,k;
//         i = j = k = 90;
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         //Widening Conversion - lower to higher data type
//         int num = 10;
//         double newNum = num;

//         System.out.println("Integer value: " + num);
//         System.out.println("Double value: " + newNum);

//         //Narrowing Conversion - higher to lower data type
//         double decimalNum = 9.99;
//         int newDecimalNum = (int) decimalNum;

//         System.out.println("Double value: " + decimalNum);
//         System.out.println("Integer value after narrowing: " + newDecimalNum);
//     }
// }

// import java.util.*;

// public class main {
//     public static void main(String[] args) {
//         ArrayList<String> names = new ArrayList<>();
//         names.add("Omkar");
//         names.add("Shivam");
//         names.add("Sagar");
//         names.add("Siddharth");
//         names.add("Shivam");

//         // System.out.println(names);

//         //Accessing elements
//         // System.out.println("Frist element: " + names.get(0));

//         //Updating elements
//         // names.set(0, "Akash");
//         // System.out.println(names);

//         //Removing elements
//         // names.remove("Sagar");
//         // System.out.println(names);

//         //Checking if an element exists
//         // System.out.println("Contains 'Shivam': " + names.contains("Shivam"));

//         //Size of the ArrayList
//         System.out.println("Size of the ArrayList: " + names.size());
//     }
// }

//Linked List

// import java.util.*;

// public class main {
//     public static void main(String[] args) {
//         LinkedList <String> names = new LinkedList<>();
//         names.add("Omkar");
//         names.add("Shivam");
//         names.add("Sagar");
//         names.addFirst("Siddharth");
//         names.addLast("Akash");
//         System.out.println(names);
//     }
// }


//enum in Java
// public class main {
//     enum Days {
//         MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//     }
//     public static void main(String[] args) {
//         Days today = Days.MONDAY;
//         switch (today) {
//             case MONDAY:
//                 System.out.println("Today is Monday");
//                 break;
//             case TUESDAY:
//                 System.out.println("Today is Tuesday");
//                 break;
//             case WEDNESDAY:
//                 System.out.println("Today is Wednesday");
//                 break;
//             case THURSDAY:
//                 System.out.println("Today is Thursday");
//                 break;
//             case FRIDAY:
//                 System.out.println("Today is Friday");
//                 break;
//             case SATURDAY:
//                 System.out.println("Today is Saturday");
//                 break;
//             case SUNDAY:
//                 System.out.println("Today is Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//                 break;
//         }
//     }
// }


// public class main {
//     enum HttpsStatus{
//         OK(200,"Success"),
//         NOT_FOUND(404,"Resourses Not Found"),
//         INTERNAL_ERROR(500,"Internal Server Error");

//         private int code;
//         private String message;
//         //value set
//         HttpsStatus(int code , String message){
//             this.code = code;
//             this.message = message;
//         }
//         //value get
//         public int getCode(){
//             return code;
//         }
//         public String getMessage(){
//             return message;
//         }
//     }

    
//     public static void main(String[] args) {
//         HttpsStatus status = HttpsStatus.OK;

//         System.out.println("HTTPS code : " + status.getCode());
//         System.out.println("Message : " + status.getMessage());
        
//     }
// }

//creating a class
// public class main{
//     final int speed = 100;  //attribute declaration
//     public static void main(String[] args) {
//         main car = new main();
//         car.speed = 120; //attribute initialization
//         System.out.println("Car speed is: " + car.speed + " km/h");
//     }
// }


// class method
// public class main {
//     static void myMethod(){
//         System.out.println("Hello, this is my method!");
//     }
//     public static void main(String[] args) {
//         myMethod();
//     }
// }

// class with parameters
// public class main {
//     static void speed(int maxSpeed){
//         System.out.println("The maximum speed is: " + maxSpeed + " km/h");
//     }
//     public static void main(String[] args) {
//         main car = new main(); //created object from main class
//         car.speed(120);

//     }
// }


//constructor
// public class main {
//     public main(){
//         System.out.println("New Object Created");
//     }

//     public static void main(String[] args) {
//         main stu0 = new main();
//         main stu1 = new main();
//     }
// }

//constructor with parameters
// public class main {
//     int id;
//     public main(int i){
//         id = i;
//         System.out.println("ID is: " + id);
//     }

//     public static void main(String[] args) {
//         main stu = new main(12);
//     }
// }

//Inheritance
// parent class - super class
// class Vehicle{
//     // attribute
//     protected String brand = "Ford";  //protected access modifier allows access in subclasses
//     // method
//     public void speed(){
//         System.out.println("The vehicle is moving at a speed of 60 km/h");
//     }
// }

// // child class - sub class
// class main extends Vehicle{
//     private String modelName = "Mustang";
//     public static void main(String[] args) {
//         main myCar = new main();
//         myCar.speed();  //calling method from parent class
//         System.out.println("Brand: " + myCar.brand);  //accessing protected variable from parent class
//         System.out.println("Model: " + myCar.modelName);
//     }
// }



// polymorphism
// class User{
//     public void display(){
//         System.out.println("This is a user");
//     }
// }

// class Student extends User{
//     public void display(){
//         System.out.println("This is a student");
//     }
// }

// class Teacher extends User{
//     public void display(){
//         System.out.println("This is a teacher");
//     }
// }

// public class main {

//     public static void main(String[] args) {
//         User user1 = new User();
//         Student student1 = new Student();
//         Teacher teacher1 = new Teacher();

//         user1.display();  // This is a user
//         student1.display();  // This is a student
//         teacher1.display();  // This is a teacher
//     }
// }



// class BankAccount{
//     protected void accessBalance(){
//         System.out.println("Accessing balance...");
//     }
// }

// class SavingsAccount extends BankAccount{
//     public void viewBalance(){
//         accessBalance();
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         SavingsAccount s1 = new SavingsAccount();
//         s1.viewBalance();  // Accessing private method through public method
//     }
// }

// String Methods
// public class main {
//     public static void main(String[] args) {
//         // String name = " Java Programming ";
//         // System.out.println(name.length());
//         // System.out.println(name.trim());
//         // System.out.println(name.substring(1,5));
//         // System.out.println(name.contains("gram"));
//         // System.out.println(name.replace("Java","Python"));

//         String a = "Hello";
//         String b = "Hello";
//         String c = new String("Hello");

//         System.out.println(a == b);
//         System.out.println(a == c);
//         System.out.println(a.equals(c)); // it checks the values

//     }
// }

// Exception Handling
// public class main {
//     public static void main(String[] args) {
//         try{
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Can't be divisible by zero");
//         }
//         finally{
//             System.out.println("Try/Catch block excuted");
//         }
//     }
// }

// public class main {
//     static void checkAge(int age) throws Exception{
//         if(age<18){
//             throw new Exception("Not eligible to vote");
//         }
//         else{
//             System.out.println("Eligible to vote");
//         }
//     }
//     public static void main(String[] args) {
//         try {
//             checkAge(22);
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }


// Functions
// public class main {
//     static void greet(){
//         System.out.println("Hello Welcome to Functions in Java");
//     }

//     public static void main(String[] args) {
//         greet();
//         greet();
//         greet();
//     }
// }



//Functions with parameters
// public class main {
//     static void greet(String name){
//         System.out.println("Hello " + name + " Welcome to Functions in Java");
//     }

//     public static void main(String[] args) {
//         greet("Rahul");
//         greet("Omkar");
//     }
// }


// public class main {
//     static void salaryCalculator(int salary){
//         // income tax - 12% & PF - 8%
//         double incomeTax = salary/100*12;
//         double pf = salary/100*8;
//         double netSalary = salary - (incomeTax + pf);

//         System.out.println("Salary: " + salary);
//         System.out.println("Income Tax: " + incomeTax);
//         System.out.println("PF: " + pf);
//         System.out.println("Net Salary: " + netSalary);
//     }
//     public static void main(String[] args) {
//         salaryCalculator(50000);     
//     }
// }


// public class main {
//     static void currencyConverter(int rs){
//         double doller = rs / 86.50;
//         System.out.println("Rs. " + rs + " = $" + doller); // Rs. 1000 = $11.56
//     }
//     public static void main(String[] args) {
//         currencyConverter(1000);
//     }
// }

// function with return type
// public class main {
//     static int square(int num){
//         return num * num;
//     }
//     public static void main(String[] args) {
//         int result = square(5);
//         System.out.println("The square of 5 is: " + result); // The square of 5 is: 25
//     }
// }

// class Example{
//     void nonStaticFunc(){
//         System.out.println("This is a non-static function");
//     }

//     static void staticFunc(){
//         System.out.println("This is a static function");
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         // static function
//         Example.staticFunc();
//         // non-static function
//         Example ex = new Example();
//         ex.nonStaticFunc();
//     }
// }


// File Handling
// Creating a file

// import java.io.File;
// import java.io.IOException;

// public class main {
//     public static void main(String[] args) {
//         try {
//             File myFile = new File("example.txt");
//             if(myFile.createNewFile()){
//                 System.out.println("File created: " + myFile.getName());
//             } else {
//                 System.out.println("File already exists.");
//             }
//         } catch (Exception e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }


// Writing to a file
// import java.io.FileWriter;
// import java.io.IOException;
// public class main {

//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("example.txt");
//             writer.write("Hello, this is a sample text written to the file.");
//             writer.write("\nThis is a new line in the file.");
//             writer.close();
//             System.out.println("Successfully wrote to the file.");
//         } catch (Exception e) {
//             System.out.println("An error occurred while writing to the file.");
//             e.printStackTrace();
//         }
//     }
// }


// Reading from a file
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class main {

//     public static void main(String[] args) {
//         try {
//             File myFile = new File("example.txt");
//             Scanner myReader = new Scanner(myFile);
//             while(myReader.hasNextLine()){
//                 String line = myReader.nextLine();
//                 System.out.println(line);
//             }
//             myReader.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("An error occurred while reading the file.");
//             e.printStackTrace();
//         }
//     }
// }

// Appending to a file
// import java.io.FileWriter;
// import java.io.IOException;

// public class main {
//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("example.txt");
//             writer.write("\nThis line is appended to the existing file.");
//             writer.close();
//             System.out.println("Successfully appended to the file.");
//         } catch (IOException e) {
//             System.out.println("An error occurred while appending to the file.");
//             e.printStackTrace();
//         }
//     }
// }


// Deleting a file
// import java.io.File;
// public class main {
//     public static void main(String[] args) {
//         File myFile = new File("example.txt");
//         if(myFile.delete()){
//             System.out.println("File deleted successfully: " + myFile.getName());
//         }
//         else{
//             System.out.println("Failed to delete the file: " + myFile.getName());
//         }
//     }
// }

// 17/06/25
// recurssion

// public class main {
//     public static void main(String[] args) {
//         int result = total(10);
//         System.out.println(result);
//     }
//     public static int total(int n){
//         if(n>0){
//             return n + total(n-1);
//         }
//         else{
//             return 0;
//         }
//     }
// }


// Method Scope
// public class main {

//     public static void main(String[] args) {
//         int x = 10;

//         System.out.println(x);
//         test();
//     }

//     public static int test(){
//         System.out.println(x);
//         return 0;
//     }
// }

// Block Scope
// public class main {

//     public static void main(String[] args) {
//         {
//             int a = 34;
//             System.out.println(a);
//         }
//         // System.out.println(a); - cannot be called outside the block
//     }
// }


// import java.util.ArrayList;;

// public class main {

//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<Integer>();
//         numbers.add(67);
//         numbers.add(99);
//         numbers.add(4);
//         numbers.add(147);
//         numbers.forEach((n)->{System.out.println(n);});
//     }
    
// }

