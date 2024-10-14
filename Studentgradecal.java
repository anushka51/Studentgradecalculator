import java.util.Scanner;  
public class Studentgradecal {
    public static String calculateGrade(double averagepercentage)
{
    if(averagepercentage >=90)
    {
        return "A"; 
    }
    else if(averagepercentage>=80)
    {
        return "B";
    }
      else if(averagepercentage>=70)
      {
        return "C";
      }
      else if(averagepercentage>=60)
      {
        return "D";
      }
      else 
      {
        return "F";
      }
}
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of subjects: ");
    int numSubjects = sc.nextInt();
    int[] marks = new int[numSubjects]; 
    int totalMarks = 0;
    for(int i =0; i<numSubjects;i++)
    {
        System.out.print("Enter marks obtained in subject " +(i+1) + " (out of 100): ");
        marks[i] = sc.nextInt();
        totalMarks += marks[i]; 
    }
     double averagepercentage = (double) totalMarks / numSubjects;
     String grade = calculateGrade(averagepercentage); 
     System.out.println("\n Total Marks: " + totalMarks);
     System.out.println("Average percentage: " + averagepercentage + "%");
     System.out.println("Grade: " + grade);
     sc.close();
 }
}
    