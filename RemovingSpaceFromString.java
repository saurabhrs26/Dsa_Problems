class RemovingSpaceFromString{
    public static void main(String[] args) {
        String s="Saurabh Ramesh Sakharkar";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char chr=s.charAt(i);
            if(chr!=' ')
            {
                sb.append(chr);
            }
        }
       
        String str=sb.toString();
        System.out.println(str);
    }
}