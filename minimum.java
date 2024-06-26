import java.util.LinkedList;
import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        LinkedList <String> program =new LinkedList<>();{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int arr[]=new int[a];
            for( int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }
            int min=arr[0];
              for( int i=1;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }

              }
              System.out.println("Minimum value is :" +min);
           
          }
        }    
     
    }/*output:
Enter the value:5
14
67
33
89
18
Minimum value is :14 */


