import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
         String str="hi i'm learning java programming";
         StringTokenizer st=new StringTokenizer(str);
         System.out.println(st.countTokens());
         System.out.println(st.nextToken());
         System.out.println(st.countTokens());
         while(st.hasMoreElements())
         {
        	 System.out.println(st.nextToken());
         }
         System.out.println(st.countTokens());
	}
}
