

import java.util.*;

public class HW001 {


    public static void main(String[] args) {
        HJ3();
//        HJ2();
//        HJ1();
    }
    //    HJ3 计算某字符出现次数
    public static void HJ3(){
        Scanner in = new Scanner(System.in);
        int sum= in.nextInt();
        Map<String,String> m=new HashMap();
        List<Integer> l=new ArrayList();
        while (sum!=0){
            int i = in.nextInt();
            if (m.get("a"+i)==null){
                l.add(i);
                m.put("a"+i,"1");
            }
            sum--;
        }
        Collections.sort(l);
        for (int j:l) {
            System.out.println(j);
        }
    }
    //    HJ2 计算某字符出现次数
    public static void HJ2(){
        Scanner in = new Scanner(System.in);
        String sum= in.nextLine().toUpperCase(Locale.ROOT);
        String c= in.nextLine().toUpperCase(Locale.ROOT);
        System.out.println(sum.replaceAll(c,c+"!").split(c).length-1);
    }
    //    HJ1 字符串最后一个单词的长度
    public static void HJ1(){
        Scanner in = new Scanner(System.in);
        String sum= in.nextLine();
        System.out.println(sum.substring(sum.lastIndexOf(" ")+1).length());
    }

}

