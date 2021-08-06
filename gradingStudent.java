public class gradingStudent {

public static void main(String[] args) {                           
    int[] grades = {73, 40, 46, 33, 38, 35, 84};             //check grades if its greater than 38 then add value which is the next 5 multiple of grade and also check whether that value is less than 3 or not. 
    int[] newListgrades = new int[grades.length];
    for (int i = 0; i < grades.length; i++)  {
        if(grades[i] < 38){
            System.out.println(grades[i]);
            continue;
        }
        else{
             newListgrades[i] = ((grades[i]/5)*5) + 5;
             if((newListgrades[i] - grades[i]) >= 3) {
                System.out.println(grades[i]);
                continue;
              }
              else{
                  int add = newListgrades[i] - grades[i];
                  grades[i] = grades[i] + add;
                  System.out.println(grades[i]);
              }
        }
             
      }
  }
}

