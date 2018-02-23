import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 sol=new Solution2();
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String min, hr;
        if( (h>=1 && h<12)&& (m>=0 &&m<60) ){
            
            
            if(m>=0 && m<=30){
                 hr=sol.numberToText(h);            
                min=sol.numberToText(m);
                    sol.beforeHalfPast(hr,min);
            }
            else{
                m=60-m;
                min=sol.numberToText(m);
                h=h+1;
                hr=sol.numberToText(h);
                sol.afterHalfPast(hr,min);
                          }
  
            }
        
        else{
            System.out.println("Invalid input");
        }
        }
        
    
    public String numberToText(int s){
        String t;
        
        switch (s){
                case 0: t="o' clock";
                break;
                case 1: t="one";
                break;
                case 2: t="two";
                break;
                case 3: t="three";
                break;
                case 4: t="four";
                break;
                case 5: t="five";
                break;
                case 6: t="six";
                break;
                case 7: t="seven";
                break;
                case 8: t="eight";
                break;
                case 9: t="nine";
                break;
                case 10: t="ten";
                break;
                case 11: t="eleven";
                break;
                case 12: t="twelve";
                break;
                case 13: t="thirteen";
                break;
                case 14: t="fourteen";
                break;
                case 15: t="quarter";
                break;
                case 16: t="sixteen";
                break;
                case 17: t="seventeen";
                break;
                case 18: t="eighteen";
                break;
                case 19: t="nineteen";
                break;
                case 20: t="twenty";
                break;
                case 21: t="twenty one";
                break;
                case 22: t="twenty two";
                break;
                case 23: t="twenty three";
                break;
                case 24: t="twenty four";
                break;
                case 25: t="twenty five";
                break;
                case 26: t="twenty six";
                break;
                case 27: t="twenty seven";
                break;
                case 28: t="twenty eight";
                break;
                case 29: t="twenty nine";
                break;
                case 30: t="half";
                break;
            default: t="default";
            break;
                   
                
        }
    return t;
    }
        public void beforeHalfPast(String hour , String minutes){
            if(minutes=="o' clock"){
                System.out.println(hour+" "+ minutes);
            }
            else if(minutes=="one"){
                System.out.println("one minute past " + hour);           
            }else if(minutes=="half" || minutes=="quarter"){
                System.out.println(minutes+" past "+ hour);
            }
            else{
                System.out.println(minutes+" minutes past "+ hour);
            }
            
        }
        
        public void afterHalfPast(String hour, String minutes){
            if(minutes=="one"){
                
               System.out.println("one minute to " + hour);
            }
            else if(minutes=="quarter"){
                System.out.println(minutes+" to "+ hour);
            }
            else{
               System.out.println(minutes+" minutes to "+ hour) ;
            }
        }
        
        
    }