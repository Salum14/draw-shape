import java.util.Scanner;
import java.utile.*;

public class Exercise5 
{
    public static void main(String[] args)
    {
        instructions();
        while(true)
        {
            int choice = menu();
            if(choice ==3)
                System.exit(0);
            else
                draw_shape(choice);
        }
    }
    //1
    public static void instructions ()
    {
        System.out.println("This program that draws a diamond or a triangle with a size that the user selects using a specific character that will be entered at the keyboard.");
    }

    //2
    public static int menu()
    {
        Scanner keyboard = new Scanner(System.in);
        //print menu
        System.out.println("\n1: draw triangle");
        System.out.println("2: draw diamond");
        System.out.println("3: quit");
        System.out.println("Enter a choice: ");
        int choice = keyboard.nextInt();
        //input validation
        while(!(choice == 1 || choice == 2 || choice == 3))
        {
            System.out.println("invalid input!");
            System.out.print("Enter a choice (again): ");
            choice = keyboard.nextInt();
        }
        return choice;
    }

    //3
    public static void draw_shape(int choice)
    {
        //get size of the shape
        int size = get_size();
        //get char of the shape
        char c = get_char(); 
        //invoke draw triangle or diamond based upon user's choice
        if(choice == 1)
            draw_triangle(size,c);
        if(choice == 2)
            draw_diamond(size,c);

    }

    //4
    public static int get_size()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the size info: ");
        int size = keyboard.nextInt();
        return size;


    }
    //5
     public static char get_char()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the char info: ");
        char c = keyboard.next().charAt(0);
        return c;
    }
    //6
    public static void draw_triangle(int size, char c)
    {

        for(int i=0 ; i<size; i++)
        {
            //padding space loop
            for(int k=size-i-1; k>0; k--)
                System.out.print(" ");

            //print c loop
            for(int j=0; j<2*i+1 ; j++)
                System.out.print(c);
            System.out.println();
        }
    }
    //7
    public static void draw_diamond(int size, char c)
    {
        System.out.println("inside draw_diamond");
        //invoke draw triangle
        draw_triangle(size,c);
        //invoke draw bottom
        draw_bottom(size,c);
    }
    //8
    public static void draw_bottom(int size, char c)
    {
       

         for(int i=size-1 ; i>0; i--)
        {
            //padding space loop
            for(int k=0; k<size-i; k++)
                System.out.print(" ");

            //print c loop
            for(int j=2*i-1; j>0; j--)
                System.out.print(c);
            System.out.println();
        }

    }

}


