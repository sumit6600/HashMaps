import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {

    /*1. Find the maximum occuring chracter in string using Ascii value*/
    static char maxOccuringChar(String str){
        int arr[] = new int[256];
        int maxoccur = 0;
        char ans  = 'a';
        str = str.toLowerCase();
        for(int i= 0;i<str.length() ; i++){
          arr[str.charAt(i)]= arr[str.charAt(i)] + 1;
            if(arr[str.charAt(i)] > maxoccur){
                maxoccur = arr[str.charAt(i)];
                ans = str.charAt(i);
            }
        }
        return ans;
    }

    /*2. Find Maximum occuring String */
    static String maxOccuringString(String arr[]){
        String ans = "";
        int maxfrequency = 0;
        HashMap<String, Integer> objectHashMap= new HashMap<>();
        for(int i =0 ;i<arr.length;i++){
            if(objectHashMap.containsKey(arr[i])){
                objectHashMap.put(arr[i] ,objectHashMap.get(arr[i]) +1);
            }else {
                objectHashMap.put(arr[i] , 1);
            }
        }
        System.out.println(objectHashMap);
        Set<Map.Entry<String , Integer>> keyvalue =  objectHashMap.entrySet();
        System.out.println(keyvalue);
        Set<String> key = objectHashMap.keySet();
        for(String str : key){
            System.out.println(str);
        }
        System.out.println(key);
        for(int i =0 ;i<arr.length;i++){
            System.out.println(objectHashMap.get(arr[i]));
            if(objectHashMap.get(arr[i]) > maxfrequency){
                maxfrequency = objectHashMap.get(arr[i]);
                ans = arr[i];
            }
        }
        return ans;
    }

    /*3.Remove duplicates from the array and the value should be in the same order*/
    static ArrayList<Integer> removeduplicates(int arr[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer , Boolean> haveElementObj = new HashMap<>();
        for(int i =0 ;i< arr.length ;i++){
            if(haveElementObj.containsKey(arr[i])){
                continue;
            }
            arrayList.add(arr[i]);
            haveElementObj.put(arr[i] , true);
        }
        return arrayList;
    }

    /*4. Print Intersection we have two array list arr1 and arr2 print intersection in arr2 order*/
    static void printInterscetion(int arr1[] , int arr2[]){
    HashMap<Integer, Boolean> arr2hash = new HashMap<>();
    for(int i =0 ;i<arr2.length ;i++){
        arr2hash.put(arr2[i] , false);
    }

    }

    public static void main(String[] args){
        System.out.println("HasMaps:");
        char maxfrequencychar = maxOccuringChar("Apple");
        System.out.println(maxfrequencychar);
        String[] arr = new String[]{"orange" , "apple" ,"grapes" , "orange" , "banana"};
        String maxfrequencyString = maxOccuringString(arr);
        System.out.println(maxfrequencyString);
        int removearr[] = {2, 3 ,4 ,2 ,1 ,3, 4 ,7 ,8, 9,1 ,4 , 10 , 11};
        ArrayList<Integer> resultremovearray = removeduplicates(removearr);
        System.out.println(resultremovearray);

    }
}

/*NOTE:-
    Integer a = null; Integer have a class and a object so it can take null value but int not
    System.out.println(a);
    int b = a;
    System.out.println(b);
* */