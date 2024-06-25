package ExceptionExample;

 class UserDefinedException extends Exception{
    public  UserDefinedException(String msg)
    {
      super(msg);
    }
    
}
public class MainClass {
    public static void main(String[] args) {
      int age=10;
      if(age>90){
        try{
            throw new UserDefinedException("Age cannot be 100");
          }
          catch(UserDefinedException u)
          {
            System.out.println(u);
          }
      }
      else{
        System.out.println("Age is less than 90");
      }
     


    }
}
