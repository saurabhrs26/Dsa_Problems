public class RemovingVowels {
    public static void main(String[] args) {
        String S="Geeks for Geeks";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='a'&& S.charAt(i)!='A'&& S.charAt(i)!='e'&&S.charAt(i)!='E'&&S.charAt(i)!='i'&&S.charAt(i)!='I'&& S.charAt(i)!='o'&& S.charAt(i)!='O'&& S.charAt(i)!='u'&& S.charAt(i)!='U')
            {
                sb=sb.append(S.charAt(i));
            }

    }
    String result=sb.toString();
    System.out.println(result);
}
}
