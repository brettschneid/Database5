import java.util.Scanner;
import java.util.Arrays;

public class Lab{
    public static void display(String[] names, double[] balances){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = in.nextLine();
        for(int i = 0; i < 100; i++){
            if (name.equals(names[i])){
                System.out.print("Your balance is $");
                System.out.printf("%.2f", balances[i]);
                System.out.println();
                break;
            }
        }
    }

    public static void newAccount(String[] names, double[] balances, int count){
        Scanner in = new Scanner(System.in);
        System.out.print("Please input name: ");
        String name = in.nextLine();
        System.out.print("Please input account balance: ");
        int balance = in.nextInt();
        names[count] = name;
        balances[count] = balance;
    }

    public static void addMoney(String[] names, double[] balances){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = in.nextLine();
        System.out.print("Please enter change in balance: ");
        double deltaMoney = in.nextDouble();
        for(int i = 0; i < 100; i++){
            if (name.equals(names[i])){
                balances[i] = balances[i] + deltaMoney;
                break;
            }
        }
    }
    public static void main(String[] args){
        boolean x = true;
        String[] names = new String[100];
        double[] balances = new double[100];
        System.out.println("Welcome!");

        while(x){
            System.out.println("Please choose an option: [n]ew account, [d]isplay balance, [c]hange balance, [q]uit");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
        
            if(input.equals("n")){
                int count = 0;
                newAccount(names, balances, count);
                count++;
                }

            if(input.equals("d")){
                display(names, balances);
            }

            if(input.equals("c")){
                addMoney(names, balances);
            }

            if(input.equals("q")){
                x = false;
                System.out.println("Thank you.");
            }
        }
    }
}