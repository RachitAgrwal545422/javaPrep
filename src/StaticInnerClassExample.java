public class StaticInnerClassExample {
    public static void main(String[] args) {
        //We can create Objects of USB class as well directly from Computer class because it is static inner class
        Computer computer = new Computer("MacBook");
        Computer.USB usb = new Computer.USB("Type-C");
    }
}
