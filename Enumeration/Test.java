package Enumeration;
enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class Calendar{
    public void printAllDays(){
        Days all[] = Days.values();
        System.out.println("Printing all days");
        for(Days d :all){
            System.out.println(d + " "+ d.ordinal());
        }
    }


    public void printToday(int n){
        Days all[]= Days.values();
        System.out.println("Today is : " +all[n]);
    }

    public void printWorkingHours(Days d){
        System.out.print("Your Working Hours for Today is: ");
        if(d==Days.SUNDAY){
            System.out.println("No Working");
        }
        else if(d == Days.MONDAY){
            System.out.println("09:00 - 15:00");
        }
        else if(d == Days.TUESDAY){
            System.out.println("09:00 - 15:00");
        }
        else if(d == Days.WEDNESDAY){
            System.out.println("02:00 - 08:00");
        }
        else if(d == Days.THURSDAY){
            System.out.println("15:00 - 00:00");
        }
        else if(d == Days.FRIDAY){
            System.out.println("09:00 - 16:00");
        }
        else{
            System.out.println("Weekend");
        }
    }

    public void printAssignedTeams(Days d){
        System.out.print("Assigned Team is: ");
        switch (d) {
            case SUNDAY:
                System.out.println("All team off");
                break;
            case MONDAY:
                System.out.println("Team A");
                break;
            case TUESDAY:
                System.out.println("Team B");
                break;
            case WEDNESDAY:
                System.out.println("Team E");
                break;
            case THURSDAY:
                System.out.println("Team A");
                break;
            case FRIDAY:
                System.out.println("Team C");
            default:
                System.out.println("Weekend Party");
                break;
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Days all[] = Days.values();
        Days d= Days.WEDNESDAY;
        System.out.println(d);

        Calendar c = new Calendar();
        c.printAllDays();
        c.printToday(2);
        c.printWorkingHours(d);
        c.printAssignedTeams(d);

        
    }
}
