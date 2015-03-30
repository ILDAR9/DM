import java.util.*;

/**
 * Created by ildar on 22.03.15.
 */
public class Test {

    public static void main(String[] args) {
        binSearch();
    }

    static void binSearch(){
        int[] a = new int[]{1,2,3,4,5,5,6};
        System.out.println(Arrays.binarySearch(a,1));
    }

    static int fac(int n){
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }



    public static List<String> perm(List<String> tokens, List<String> result, int currentLength, int maxLength){
        if(currentLength == maxLength){
            return result;
        }
        List<String> gen = new ArrayList<String>();
        for(String s : result){
            for(String s1 : tokens){
                if(s.equals(s1) || s.contains(s1)){
                    continue;
                }else{
                    String temp = s+s1;
                    char[] ca = temp.toCharArray();
                    Arrays.sort(ca);
                    String res = "";
                    for(char c : ca){
                        res+=c;
                    }
                    if(gen.contains(res)){
                        continue;
                    }
                    gen.add(res);
                }
            }
        }
        if(gen.size() > 0){
            result.addAll(perm(tokens,gen,currentLength+1,maxLength));
        }
        return result;
    }

    static void getToList(){
        long startTime = System.currentTimeMillis();
        int dev = 1;
        Map<int[], Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i <101400000;i++){
            int[] a = {i-1,i,i+1};
            map.put(a,1);
//            list.add(i);
            if (i / 1000000 == dev){
                System.out.println(dev+"million is done");
                dev++;
            }
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    static int[] b;

    static void generate(){
        long startTime = System.currentTimeMillis();
        int[] data = new int[101400000];
        int dev = 1;
        for (int i = 0;i <101400000;i++){
            data[i] = i;
            b=data;
            if (i / 1000000 == dev){
                System.out.println(dev+"million is done");
                dev++;
            }
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

    static void vgetVf(){

        int[][] vdf = new int[2][101500000];
        long startTime = System.currentTimeMillis();
        int dev = 1;
        for (int i = 0;i <101400000;i++){
            vdf[0][i] = i;
            vdf[1][i] = i;
            if (i / 1000000 == dev){
                System.out.println(dev+"million is done");
                dev++;
            }
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time Create 1-frequent set: " + elapsedTime);
    }
}
