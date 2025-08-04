class Airtel
{   
    static int n1=0,n2=1,n3=0;        
     static void println(int count)
     {        
        if(count>0)
        {        
             n3 = n1 + n2;        
             n1 = n2;       
             n2 = n3;        
             System.out.print(" "+n3);       
             println(count-1);        
         }        
     }          
}  
public class Main
{  
 public static void main(String[] args)
 {    
    int count=15;        
    System.out.println(F.n1+" "+F.n2);
    Airtel.println(count-2);      
 }    
}