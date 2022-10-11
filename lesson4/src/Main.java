import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {

     /*   String str ="I Like Java!!";
        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.endsWith("!!"));
        System.out.println(str.startsWith("Like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java",1));
        System.out.println(str.replace('a','o'));
        System.out.println(str);
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        System.out.println(str.toUpperCase(Locale.ENGLISH));
        System.out.println(str.substring(str.indexOf("I Like"),(str.indexOf("I Like")+"I Like".length())));
*/


   /*    // Дано два числа, например 3 и 56, необходимо составить следующие строки:
       // 3 + 56 = 59
      //  3 – 56 = -53
      //  3 * 56 = 168.
      //  Используем метод StringBuilder.append().
      //          Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
      //           Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        Integer x,y;
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str= buf.readLine();
        x=Integer.parseInt(str);
        str= buf.readLine();
        y=Integer.parseInt(str);
        Integer res=x+y;
        StringBuilder sb=new StringBuilder(x.toString());
        sb.append(" + ");
        sb.append(y.toString());
        sb.append(" = ");
        sb.append(res.toString());
        System.out.println(sb);

        res=x-y;
        StringBuilder sc=new StringBuilder(x.toString());
        sc.append(" - ");
        sc.append(y.toString());
        sc.append(" = ");
        sc.append(res.toString());
        sc.deleteCharAt(sb.indexOf("=")).insert(sb.indexOf("="),"равно" );
        System.out.println(sc);

        res=x*y;
        StringBuilder sa=new StringBuilder(x.toString());
        sa.append(" * ");
        sa.append(y.toString());
        sa.append(" = ");
        sa.append(res.toString());
        sa.replace(sa.indexOf("="), sa.indexOf("=")+1, "равно" );
        System.out.println(sa);
 */

        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str= buf.readLine();
        StringBuilder sb=new StringBuilder(str);
        Find2oop(sb);
        System.out.println(sb);
    }

    public static void Find2oop(StringBuilder sb){
        int temp=0;
        int tempL=0;

        for (int i=0; i<sb.length();) {
            while (sb.toString().contains("Object-oriented programming")) {
                System.out.println(i);
                tempL = sb.indexOf("Object-oriented programming") ;
                temp++;
                if (temp % 2 == 0) {
                    sb.replace(tempL, tempL + "Object-oriented programming".length(), "OOP");

                }

            i = sb.indexOf("Object-oriented programming") ;

            System.out.println(sb);



        }
        }
    }

}
