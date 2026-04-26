public class LocalInnerClassesExample {
    public static void main(String[] args) {
        //This is a local inner class
        class LocalInnerClass {
            final String stringValue;
            LocalInnerClass(String stringValue) {
                this.stringValue = stringValue;
            }
            void print() {
                System.out.println(stringValue);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass("Hello");
        localInnerClass.print();
    }
}
