package multithreading;

public class Practice {
    Thread t1 = new Thread(()->{
        try {
            for(int i=0;i<10;i++){}
        } catch (Exception e) {
            System.out.println(e);
        }
    });


}
