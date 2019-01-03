import com.sun.jdi.IntegerValue;

import java.lang.String;
import java.lang.Integer;
import java.util.Scanner;

public class Root {


    // Function to check if
    // x is power of 4
    int flag = 0;
    int n;
    String intValue,strValue;

    public static boolean isNumber(String strValue) {
       // String regex = "[0-9]";
        boolean b = strValue.matches("-?\\d+(\\.\\d+)?");
        if (b) {
            int n = Integer.parseInt(strValue);
            return powerOf(n);

        }
        else
            return false;
    }




        public static boolean powerOf (int n) {
            if (n == 0)
                return false;
            while (n != 1) {
                if (n % 4 != 0)
                    return false;
                    n = n / 4;
            }
            return true;
        }
        public void main (String[] args){
            Scanner sc = new Scanner(System.in);
            strValue = sc.nextLine();
            isNumber(strValue);

        }
    }



