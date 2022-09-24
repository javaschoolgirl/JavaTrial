/**
* Java Basic. Home work #2
*
*@author Marina Bergen
*
*@todo 07.09.2022
*
*@date 24.09.2022
*/
class HomeWork2 {
    public static void main(String[] args) {
            //task #1
           String checkWeather;
            int temperature = 30;
            if (temperature < 0) {
                System.out.println("It's frost");
            }else if (temperature > 0 && temperature <= 18) {
                System.out.println("It's cold");
            }else if (temperature > 0 && temperature <= 28) {
                System.out.println("It's warm");
            } else {
                System.out.println("It's hot");
            //task #2
            String canWalk;
            boolean isWeekend = true;
            boolean isRain = false;
            if (isWeekend && isRain) {
                System.out.println("I can walk");
            } else {
                System.out.println("I cannot walk");
            //task #3
            int a = 8;
            System.out.println("a");
            int b = 4;
            System.out.println("b");
            System.out.println("a + b");
            System.out.println("a - b");
            System.out.println("a * b");
            System.out.println("a / b");
            
            //System.out.printf("a = %d, b = %d", a, b);
            //System.out.printf("%d + %d = %d\n", a, b, +(a, b));
            //System.out.printf("%d - %d = %d\n", a, b, -(a, b));
            //System.out.printf("%d * %d = %d\n", a, b, *(a, b)); 
            //System.out.printf("%d / %d = %d\n", a, b, /(a, b));
            }
        }
    }
}



