import java.util.stream.IntStream;

class Car{
    String color;
    int year;

    class Engine{
        void  run(){
            IntStream intStream = IntStream.range(1, 11);
            System.out.println("Engine is running... for "+ Car.this.color + Car.this.year);
            intStream.forEach(System.out::println);
        }
    }

    Car(String color,int year){
        this.color=color;
        this.year=year;
    }
}
public class MemberInnerClassesExample {

    public static void main(String[] args) {
        Car car = new Car("red",1994);
        Car.Engine engine = car.new Engine();
        engine.run();
    }
}
