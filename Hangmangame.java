import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String name[] ={"Dhruv" , "Sanjay", "Ajay", "Rohan "};
        Random obj = new Random();
        int random = obj.nextInt(name.length);
        String guess_name = name[random];
        for (int i = 0 ; i<guess_name.length();i++)  
        {
            list.add("_");
        }
        System.out.println(list);


        for (int j=0;j<guess_name.length()+10; j++)  
        {
            System.out.println("enter thr character");
            String guess_character = sc.next();
            if (guess_name.contains(guess_character))
            {
                System.out.println("correct");
                           for (int k=0;k<guess_name.length();k++) 
                               if (guess_name.charAt(k)==guess_character.charAt(0))
                               {
                                   list.set(k,guess_character);
                               }

                           }

                System.out.println(list); 
            }
            else
            {
                System.out.println("incorrect");
            }
            if (list.contains("_"))
            {

            }
            else {
                System.out.println("you win");
                break;
            }

        }



    }}
