class JavaBasic2Lesson {
    public static void main(String[] args) {
        //int t = - 1;
        //boolean booleanExpression = t < 0;
            //System.out.println(booleanExpression);
        /*if (booleanExpression) {
            System.out.println("It's frost");
        } else {
            System.out.println("It's NO frost");
        }*/
            //System.out.println(t < 0? "It's frost" : "It's NO zero");
        int m = 1;
        if (m == 12 || m == 1 || m == 2) {
            System.out.println("It's winter");
        } else if (m == 3 || m == 4 || m == 5) {
            System.out.println("It's spring");
        } else if (m == 6 || m == 7 || m == 8) {
            System.out.println("It's summer");
        } else if (m == 9 || m == 10 || m == 11) {
            System.out.println("It's fall");
        } else {
            System.out.println("Error Month number!");
        }
        //boolean isWeekend = !false;
        //boolean isIAmFree = true;
        //if (isWeekend &&.isIAmFree) {
            //System.out.println("I can walk");
        //} else {
            //System.out.println("I cannot walk");
        switch (m) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            case 9:
            case 10:
            case 11:
            default:
                System.out.println("Error Month number!");
                break;
        }
        int d  = 1;
        switch (m) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Error Month number!");
                
                break;
        }
    }
}