import java.util.*;
public class ECE{
    static class Pair<A, B> {
        private final A first;
        private final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        public A getFirst() {
            return first;
        }

        public B getSecond() {
            return second;
        }
    }
    public static int countMismatch(String str1, String str2) {
        int mismatchCount = 0;
        int minLength = Math.min(str1.length(), str2.length());
        int index = -1;
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                mismatchCount++;
                index = i;
            }
        }

        mismatchCount += Math.abs(str1.length() - str2.length());
        
        return mismatchCount==1?index:-1;
    }

    public static boolean isValuePresentInOtherEntries(LinkedHashMap<String, ArrayList<Integer>> map, String currentKey, int valueToCheck) {
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!key.equals(currentKey) && entry.getValue().contains(valueToCheck)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        HashMap<Integer,Pair<String,Integer>> map = new HashMap<>();
        LinkedHashMap<Integer,Pair<ArrayList<ArrayList<Integer>>,ArrayList>> group = new LinkedHashMap<>();
        int max =  Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int bitCount = (int) (Math.log(max) / Math.log(2)) + 1;
        String bitFormat = "%"+bitCount+"s";
        for(int i=0;i<size;i++){
            String binary = String.format(bitFormat,Integer.toBinaryString(arr[i])).replace(' ','0');
            int count = (int) binary.chars().filter(ch -> ch == '1').count();
            map.put(arr[i], new Pair<>(binary,count));
        }
        System.out.println("--------------------------------");
        for (Map.Entry<Integer, Pair<String,Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getFirst()+ " " + entry.getValue().getSecond());
        }
        System.out.println("--------------------------------");
        for(int count=0;count<=bitCount;count++) {
           
            ArrayList<String> binaryGroup = new ArrayList<String>();
            ArrayList<ArrayList<Integer>> mainNumberGroup = new ArrayList<>();
            for(Map.Entry<Integer, Pair<String,Integer>> entry : map.entrySet()){
                if(entry.getValue().getSecond() == count){
                    ArrayList<Integer> numberGroup = new ArrayList<Integer>();
                    numberGroup.add(entry.getKey());
                    mainNumberGroup.add(numberGroup);
                    binaryGroup.add(entry.getValue().getFirst());
                }
            }
            
            if(mainNumberGroup.size()>0){
                group.put(count, new Pair<>(mainNumberGroup, binaryGroup));
            }
        }
        for (Map.Entry<Integer,Pair<ArrayList<ArrayList<Integer>>,ArrayList>> entry : group.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getFirst()+ " " + entry.getValue().getSecond());
        }
        System.out.println("--------------------------------");
        
        Iterator<Map.Entry<Integer,Pair<ArrayList<ArrayList<Integer>>,ArrayList>>> iterator = group.entrySet().iterator();

        Pair<ArrayList<ArrayList<Integer>>,ArrayList> A = iterator.next().getValue();
        Pair<ArrayList<ArrayList<Integer>>,ArrayList> B = A;
        
        boolean flag = false;

        LinkedHashMap<Integer,Pair<ArrayList<ArrayList<Integer>>,ArrayList>> result = new LinkedHashMap<>();

        for(int loop=1;loop<bitCount-1;loop++){
            
            if(flag){
                group = result;
                iterator =  result.entrySet().iterator();
                A = iterator.next().getValue();
                B = A;
                result = new LinkedHashMap<>();
            }

            flag =  false;

            while(iterator.hasNext()){

                A = B;
                B = iterator.next().getValue();

                for(int i=0;i<A.getFirst().size();i++){
                    for(int j=0;j<B.getFirst().size();j++){
                        int ind = countMismatch(A.getSecond().get(i).toString(),B.getSecond().get(j).toString());
                        if(ind !=-1){
                            flag = true;
                            String tem = B.getSecond().get(j).toString();
                            int count = (int) tem.chars().filter(ch -> ch == '1').count()-1;
                            ArrayList<ArrayList<Integer>> val = new ArrayList<>();
                            ArrayList<String> val2 = new ArrayList<>();
                            if(result.containsKey(count)){
                                Pair<ArrayList<ArrayList<Integer>>,ArrayList> res = result.get(count);
                                val = res.getFirst();
                                val2 = res.getSecond();
                            }
                            ArrayList<Integer> t = new ArrayList<>();
                            t.addAll(new ArrayList(A.getFirst().get(i)));
                            t.addAll(new ArrayList(B.getFirst().get(j)));
                            val.add(t);
                            tem = tem.substring(0,ind)+'-'+tem.substring(ind+1);
                            val2.add(tem);
                            result.put(count,new Pair<>(val,val2));
                        }
                    }
                }
            }
            if(flag){
                for (Map.Entry<Integer,Pair<ArrayList<ArrayList<Integer>>,ArrayList>> entry : result.entrySet()) {
                    System.out.println(entry.getKey() + " => " + entry.getValue().getFirst()+ " <=> " + entry.getValue().getSecond());
                }
                System.out.println("--------------------------------");
            }
            if(loop == bitCount-2){
                group = result;
            }
        }//while(flag);


        LinkedHashMap<String,ArrayList<Integer>> finalResult = new LinkedHashMap<>();

        for (Map.Entry<Integer,Pair<ArrayList<ArrayList<Integer>>,ArrayList>> entry : group.entrySet()) {
            ArrayList<ArrayList<Integer>> lis = entry.getValue().getFirst();
            ArrayList<String> lis2 = entry.getValue().getSecond();
            for(int i=0;i<lis.size();i++) {
                if(!finalResult.containsKey(lis2.get(i))) {
                    finalResult.put(lis2.get(i),lis.get(i));
                }
            }
        }

        LinkedHashMap<String,ArrayList<Integer>> finalOutCome = new LinkedHashMap<>();

        for (Map.Entry<String,ArrayList<Integer>> entry : finalResult.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> values = entry.getValue();

            System.out.println(values + " => " + key);

             for (Integer value : values) {
                if (!isValuePresentInOtherEntries(finalResult, key, value)) {
                    finalOutCome.put(key,values);
                    break; 
                }
            }
        }
        System.out.println("--------------------------------");

        for (Map.Entry<String,ArrayList<Integer>> entry : finalOutCome.entrySet()) {
            System.out.println(entry.getValue() + " => " + entry.getKey());
        }
        System.out.println("--------------------------------");
    
        Set<String> set = new LinkedHashSet<>(finalOutCome.keySet());

        System.out.println("#################################");

        System.out.print("THE EQUATION IS : ");

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!='-'){
                    if(str.charAt(i)=='1'){
                        System.out.print((char)('A'+i));
                    }else{
                        System.out.print((char)('a'+i));
                    }
                }
            }
            if(iter.hasNext()){
                System.out.print(" + ");
            }else{
                System.out.println();
            }
        }
         System.out.println("#################################");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("NOTE :");
        System.out.println("#small letter \'abcde\' as consider as bar value. \n#capital letter \'ABCDE\' as actual value.");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}