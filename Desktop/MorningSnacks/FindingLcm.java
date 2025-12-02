import java.util.Scanner;
public class FindingLcml{
    public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int numberOne = input.nextInt();

System.out.print("Enter a number: ");
int numberTwo = input.nextInt();

int lcm = numberOne*numberTwo;
   // if(lcm % numberOne ==0 && lcm % numberTwo == 0){
System.out.print(" The lcm is : " + lcm);
//}
   // else(lcm % numberOne != 0 && lcm % numberTwo != 0){
//System.out.print("")
    }
}
