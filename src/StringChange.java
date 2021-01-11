public class StringChange {
    //把每个单词的首字母变为大写
    public static void main(String[] args) {
        String str="hello world";
        /*赋值符号左右类型必须一致*/
        String strings[]=str.split("\\s");
        String newString[]=m(strings);

        StringBuffer sb=new StringBuffer();
        for (int i=0;i<newString.length;i++){
            sb.append(newString[i]);
            sb.append("\t");
        }
        System.out.println("最终结果："+sb.toString());
    }
    public static String [] m(String str[]){
        String newString[]=new String[str.length];
        for(int i=0;i<str.length;i++){
            char a[]={str[i].charAt(0)};
            String string=new String(a);
            String part1=string.toUpperCase();
            String part2=str[i].substring(1);
            newString[i]= part1.concat(part2);
        }
        return newString;
    }
}
