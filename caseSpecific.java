import java.util.*;
class caseSpecific{
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    static sortm(String m,int l){
        StringBuilder upper = new StringBuilder(); 
        StringBuilder lower = new StringBuilder(); 

        for(i=0;i<l;i++){
            char ch=m.charAt(i);
            if(ch>="A" && ch<="Z"){
                upper.append(ch);
            }
            if(ch>="a" && ch<="z"){
                lower.append(ch);
            }
        }
        String sortedupper=sortString(upper);
        String sortedlower=sortString(lower);
        int u=0,lo=0;
        for(i=0;i<l;i++){
            char cha=m.charAt(i);
            if(ch>="A" && ch<="Z"){
                m.replace(m.charAt(i),sortedupper.charAt(u));
                u=u+1;
            }
            if(ch>="a" && ch<="z"){
                m.replace(m.charAt(i),sortedlower.charAt(lo));
                lo=lo+1;
            }
        }
        System.out.println(m);
    }
    public static void main(Strings args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int l=sc.nextInt();
            StringBuilder m=new StringBuilder();
            m=sc.nextLine();
            sortm(m,l);
        }
    }
}