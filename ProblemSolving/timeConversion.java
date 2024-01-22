package ProblemSolving;

public class timeConversion {


    public static String timeConversion(String s) {
        // Write your code here
        String[] k = s.split(":");
        if(k[k.length-1].contains("PM")){
            String hr = k[0];
            int hrInt = Integer.valueOf(hr);
            int time = hrInt;
            if(hrInt!=12){
                 time = hrInt+12;
            }



            String timeStr = String.valueOf(time);
            k[0] = timeStr;
            k[k.length-1] = k[k.length-1].substring(0,2);
            String t = "";
            for(int i =0;i< k.length;i++){
                if(i==k.length-1){
                    t=t+k[i];
                }
                else{
                    t = t + k[i]+ ":";
                }

            }
            return t;
        }
        else{
            if(k[0].contains("12")){
                k[0]="00";
            }
            k[k.length-1] = k[k.length-1].substring(0,2);
            String t = "";
            for(int i =0;i< k.length;i++){
                if(i==k.length-1){
                    t=t+k[i];
                }
                else{
                    t = t + k[i]+ ":";
                }
            }
            return t;
        }
    }
}
