
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int counter = 1;
        while (counter <=10) {
            int input = Integer.valueOf(scanner.nextLine());
            //int input = counter;
            if (input == -1) {
                break;
            }

            list.add(input);
            
        }
        //System.out.println("This is the size of the ArrayList: " + list.size());
        //System.out.println("These are the numbers in the ArrayList:");
        //for (int i = 0; i < list.size(); i++) {
        //    int number = list.get(i);
        //    System.out.println(number);

        //for int values in list{}
        //System.out.println(list.get(0));
    }
        // implement here finding the indices of a number
        System.out.println("Search for?");
        int index_var = Integer.valueOf(scanner.nextLine());
        //int index_var = 5;

        for (int output : list){
            if (output == index_var) {
                System.out.println(index_var + " is at index " + list.indexOf(output));
            }

        }
        
        
        //while (true){
        //
        //    System.out.println(index_var + " is at index "  + list.get(index_var));
        //  break;
        //}
    }
}
