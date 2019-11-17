import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mian {

    public static void main(String[] args) {
        Map<Character,Integer>map=new HashMap<>();


        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String  a=in.nextLine();
            for (int i = 0; i <a.length() ; i++) {
                char b=a.charAt(i);
                if(!map.containsKey(b)){
                    map.put(b,1);
                }else{
                    int p=map.get(b);
                    map.remove(b);
                    map.put(b,p+1);

                }
            }
            Collection<Character>s=map.keySet();
                for(char c:s){
                    System.out.println(c+":"+map.get(c));
                }

        }
    }
}
