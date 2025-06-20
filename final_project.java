import java.sql.DriverManager;
import java.util.Scanner;
// import java.sql.*;

public class final_project {
        // static final String URL;
        // static final String USER;
        // static final String PASSWORD;

        // static Connection conn;
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            // Class.forName(null);
            // conn = DriverManager.getConnection(URL,USER,PASSWORD);

            while(true){
                System.out.println("\n\n---------- Student Management SYstem----------");
                System.out.println("1.Add Student");
                System.out.println("2.View All Student");
                System.out.println("3.Update Email");
                System.out.println("4.Delete Student");
                System.out.println("5.Exit");
                System.out.println("Enter your Choice : ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch(choice){
                    case 1: 
                        addStudent(); 
                    break;
                    case 2: 
                        viewStudent(); 
                    break;
                    case 3: 
                        updateEmail(); 
                    break;
                    case 4: 
                        deleteStudent(); 
                    break;
                    case 5: 
                        exitApp(); 
                    break;
                    default: System.out.println("Invalid Option");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
