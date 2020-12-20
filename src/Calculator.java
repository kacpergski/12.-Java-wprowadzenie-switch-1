public class Calculator {

    public static void main(String[] args) {
        double a = 5.2, result = 0;
        double b = 2;
        char option = '*';

      //  switch(option){
        //    case'+': System.out.println(a+b);
        //break;
          //  case'-': System.out.println(a-b);
            //    break;
            //case'*': System.out.println(a*b);
              //  break;
           // case'/': System.out.println(a/b);
             //   break;

            switch(option){
                case'+':result = (a+b);
                break;
                case'-': result = (a-b);
                    break;
                case'*': result = (a*b);
                    break;
                case'/': result = (a/b);
                    break;
        }
        System.out.println(result);
    }
}
