package multithreading;
import java.util.List;
import java.util.concurrent.*;
public class ExecuteFrameWorkExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Hello from Executor!"));


        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        executorService.execute(() -> System.out.println("Hello from Executor!"));
        Future<Integer> f = executorService.submit(() -> {
            System.out.println("Hello from Executor!");
            return 10;
        });
        Integer f1 = executorService.invokeAny(List.of(() -> {
            System.out.println("Hello from Executor!");
            return 10;
        }, () -> {
            System.out.println("Hello from Executor!");
            return 20;
        }));
        System.out.println(f1);
        System.out.println(f.get());

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());
        scheduledExecutorService.schedule(() -> System.out.println("Hello from ScheduledExecutorService!"), 2, TimeUnit.SECONDS);


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Hello from ExecutorService!");
            return 10;
        });
        System.out.println(future.get(20, TimeUnit.SECONDS));
        future.cancel(true);

         executorService.shutdown();

         CompletableFuture<Integer> a = CompletableFuture.supplyAsync(() -> {
             System.out.println("Hello from CompletableFuture!");
             return 10;
         },executorService).exceptionally(ex -> {
             System.out.println("Exception: " + ex.getMessage());
             return -1;
         }).exceptionallyAsync(ex -> {
             System.out.println("Async Exception: " + ex.getMessage());
             return -1;
         },executorService);

         CompletableFuture.allOf(a).thenRun(() -> System.out.println("All tasks completed!"));
         System.out.println(a);

         //I have 5 task arrays and I want to execute them parallely then how can I do it?
         Runnable[] tasks = new Runnable[5];
         for (int i = 0; i < tasks.length; i++) {
             tasks[i] = () -> {
                 System.out.println("Hello from Runnable!");
             };
         }

         CompletableFuture.allOf(
                 CompletableFuture.runAsync(tasks[0], executorService),
                 CompletableFuture.runAsync(tasks[1], executorService),
                 CompletableFuture.runAsync(tasks[2], executorService),
                 CompletableFuture.runAsync(tasks[3], executorService),
                 CompletableFuture.runAsync(tasks[4], executorService)
         ).thenRun(() -> System.out.println("All tasks completed!"));

         ForkJoinPool.commonPool().execute(() ->
             System.out.println("Hello from ForkJoin!")
         );
         ExecutorService workStealingPool = Executors.newWorkStealingPool(Runtime.getRuntime().availableProcessors());
         workStealingPool.execute(() -> System.out.println("Hello from workStealingPool!"));

         new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS,
                 new LinkedBlockingQueue<>(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

}
