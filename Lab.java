import java.util.Scanner;
import java.util.Arrays;


public class Lab{



public static void display(String[] names, int[] balances){
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    for(int i = 0; i < 100; i++){
        if (name.equals(names[i])){
         System.out.println("$"+balances[i]);
        }

    }
}


public static void main(String[] args){
    boolean x = true;
    String[] names = new String[100];
    int[] balances = new int[100];
    System.out.println("Welcome");

while(x){
    System.out.println("Please choose an option: [n]ew account, [d]isplay balance, [q]uit");
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    

if(input.equals("n")){
    System.out.println("Please input name");
    String name = in.nextLine();
    System.out.println("Please input account balance");
    int balance = in.nextInt();
    int count = 0;




names[count] = name;
balances[count] = balance;
count = count + 1;
}

if(input.equals("d")){
    display(names,balances);
}


if(input.equals("q")){
    x = false;
    System.out.println("Thank you.");
}
}
}
}