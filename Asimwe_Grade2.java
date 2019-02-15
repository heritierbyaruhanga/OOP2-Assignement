import java.util.Scanner;

//public class Asimwe_Grade{
    public class Asimwe_Grade2{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String[] subjects = new String[2];
        int grades[] = new int[2];
        double sum = 0.0;
        int n=0;
        //int avg;

    do{
        System.out.println(" Asimwe IUEA System");
        System.out.println(" -----------------------------");
        System.out.println(" 1. Enter a course name and a grade ");
        System.out.println(" 2. Display all grades ");
        System.out.println(" 3. Calculate the average grade ");
        System.out.println(" 4. Calculate Class ");
        System.out.println(" 5. Exit program ");

        choice = scan.nextInt();

        if ( choice == 1 ){
            Scanner scansubjects = new Scanner(System.in);
           Scanner studentname = new Scanner(System.in);
            Scanner scangrades = new Scanner(System.in);

            // System.out.println("Enter your name");
            // String tempe = studentname.nextLine();


            System.out.println("Enter 2 Courses: ");
            System.out.println();

            int i = 0;


          for (int b = 0;b < 2 ; b++) {
            System.out.println("Enter your Name");
            String tem = studentname.nextLine();
              for( i = 0; i < 2; i++ ) {
                System.out.println("Course Name: ");

                String temp = scansubjects.nextLine();
                subjects[i] = temp.toLowerCase();
                
                System.out.println("Grade: ");

                grades[i] = scangrades.nextInt();
                    if (grades[i] == 0){
                        System.out.println("Enter a number greater to zero");
                        // scangrades.close();
                        break ;
                    } else {
                        if( i == ( subjects.length - 1 ) ){
                    System.out.println("Asante for Checking! ");
                    System.out.println();
                
            }
                    }
                
            }
              
          }
        }


        if ( choice == 2 )
        {
            System.out.println("Subjects " + "\t Grades ");
            System.out.println("---------------------");

            for(int p = 0; p < subjects.length; p++)
            {

                System.out.println(subjects[p] + "\t" + "    \t" + grades[p]);
            }
        }

        if ( choice == 3 )
        {   
              System.out.println("Total of grades: " + getSum(grades));
              System.out.println("Count of grades: " + grades.length);
              System.out.println("Average of grades: " + getAverage(grades));
              System.out.println();
        }
        if (choice == 4){
            System.out.println("Asimwe your Grade is: ");
        if(sum>=80)
        {
            System.out.println("A");
        }
        else if(sum>=20 && sum<80)
        {
           System.out.println("B");
        } 
        else if(sum>=40 && sum<20)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
        }

 
    } while ( choice != 5);

        

}

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i : array) sum += i;
        return ((double) sum)/array.length;
    }

    public static double getSum(int[] array)
    {
        int sum = 0;
        for (int i : array) {
         sum += i;
        }
        return sum;
    }


}