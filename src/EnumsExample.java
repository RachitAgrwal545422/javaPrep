enum Week{
    Sunday{
        //We can overwrite methods for a perticular instace of enum by using anonymous class
        @Override
        public String toString() {
            return "FUNDAY";
        }
    },
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;

    public void findDay(){
        System.out.println("Day found: " + this.name());
    }

    //By Default constructor is private or package private in enum and we cannot create object of enum outside of it
    //It will call for all the value(SUNDAY,MONDAY,..etc) because internally they all the instances of Week enum class
    Week(){
        System.out.println("Constructor called for: " + this.name());
    }
}
public class EnumsExample {
    public static void main(String[] args) {
        Week week = Week.Sunday;
        week.findDay();
        System.out.println(week);
    }
}