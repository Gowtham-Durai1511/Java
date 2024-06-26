import java.util.LinkedList;

public class bank {
    public static void main(String[]args){
        LinkedList <String> needs=new LinkedList<>();{
            needs.add("Aadhar");
            needs.add("pan card");
            needs.add("cibil score");
            if(needs.contains("Aadhar")&&needs.contains("pan card")||needs.contains("pen card ")){
                System.out.println("U'r eligible"); 
             }else{
                System.out.println("u'r not eligible");
             }

        }
    }   
}
