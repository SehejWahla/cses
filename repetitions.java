import java.util.Scanner;

public class repetitions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int lastAscVal = -1;
        int longest = -1;
        int currentLength = 0;
        for(int i=0;i<st.length();i++){
            char myChar = st.charAt(i);
            int myCharAscVal = (int) myChar;


            if(i==0){
                currentLength = 1;
                longest = Math.max(currentLength, longest);
                lastAscVal = myCharAscVal;
            }
            else{
                if(lastAscVal == myCharAscVal){
                    currentLength++;
                    longest = Math.max(currentLength, longest);
                }
                else{
                    currentLength = 1;
                    longest = Math.max(currentLength, longest);
                    lastAscVal = myCharAscVal;
                }
            }
        }
        System.out.print(longest);
        sc.close();
    }
}
