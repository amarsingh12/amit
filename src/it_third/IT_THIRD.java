
package it_third;
public class IT_THIRD {//method 
      
    
    void m1()//instance method
    {
        System.out.println("instance method");
    }
    
    static void m2()
    {
        int a = 20;
        System.out.println("static method" + a);
    }
   
    
    
    public static void main(String[] args) 
    {
        IT_THIRD obj = new IT_THIRD();
        m2();
        
       
    }
    
}
