public class Switch_Statements{
    public static void main(String a[]){
        int dayNumber = 5;
        String day;

        // first way to write switch statements
        // switch(dayNumber){
        //     case 1:
        //         day = "Monday";
        //         break;
        //     case 2:
        //         day = "Tuesday";
        //         break;
        //     case 3:
        //         day = "Wednesday";
        //         break;
        //     case 4:
        //         day = "Thrusday";
        //         break;
        //     case 5:
        //         day = "Friday";
        //         break;
        //     default:
        //         day = "Sunday";
        // }
        // System.out.println(day);

        // Second Way using -> without break keyword and (:)
        // day = switch(dayNumber){
        //     case 1->  "Monday";
        //     case 2->  "Tuesday";
        //     case 3->  "Wednesday";
        //     case 4->  "Thrusday";
        //     case 5->  "Friday";
        //     case 6->  "Saturday";
        //     case 7->  "sunday";
        //     default -> "Enter Valid Day Number Between 1-7 :";
        // };

        
        // Third Way using yield keyword if want to use (:) after case instead of arrow (->) ,  without break keyword
        day = switch(dayNumber){
            case 1 :  yield  "Monday";
            case 2 :  yield  "Tuesday";
            case 3 :  yield "Wednesday";
            case 4 :  yield "Thrusday";
            case 5 :  yield  "Friday";
            case 6 :  yield  "Saturday";
            case 7 :  yield "sunday";
            default:   yield "Enter Valid Day Number Between 1-7 :";
        };

        System.out.println(day);
    }
}