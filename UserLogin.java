import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        String userName,password,newPassword;
        int reset;


        Scanner scan=new Scanner(System.in);

        System.out.print("Username: ");
        userName=scan.nextLine();

        System.out.print("Password");
        password=scan.nextLine();

        if(userName.equals("Java") && password.equals("101"))
            System.out.println("Logged in");

        else {
            System.out.print("Username or password is wrong.Would you like " +
                    "to reset your password?\n1-yes\n2-no");
            reset = scan.nextInt();

            if (reset == 1) {
                System.out.print("Lütfen yeni şifrenizi giriniz: ");
                newPassword = scan.nextLine();

                if (newPassword.equals(password) || newPassword.equals("java")) {
                    System.out.println("Password could not be created.Please" +
                            "enter another password.");
                }
                else
                    System.out.println("Password changed succesfully.");
            }
        }



    }
}
