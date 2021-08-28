
import java.util.*;
import java.io.*;

public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        String str[];
        int count=0;
        Map<String,Integer> res= new HashMap<String,Integer>();
         int ar1[]= new int[100];
         int ar2[]= new int[100];
         int s1=0,s2=0;
         for(String s : array){
            str= s.split(",");
            if(str[2].trim().equals("Aundh")){
              ar1[count]=(int)Integer.parseInt(str[3].trim());
                if(s1<=ar1[count])
                        s1=ar1[count];
                       }
            if(str[2].trim().equals("Baner")){
              ar2[count]=(int)Integer.parseInt(str[3].trim());
                 if(s2<=ar2[count])
                        s2=ar2[count];
                        }
            }
        for(String s : array){
          str= s.split(",");
          if(s1==(int)Integer.parseInt(str[3].trim())) {
            Integer i=(Integer)Integer.parseInt(str[0].trim());
            res.put("Aundh",i);
          }
          if(s2==(int)Integer.parseInt(str[3].trim())) {
            Integer i=(Integer)Integer.parseInt(str[0].trim());
            res.put("Baner",i);       
          }
      }
      return res;
}
      

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("/Users/kchan/Documents/ShreeProjects/CodePlay/input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> res = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("/Users/kchan/Documents/ShreeProjects/CodePlay/output.txt")));
            for(Map.Entry<String,Integer> e: res.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
