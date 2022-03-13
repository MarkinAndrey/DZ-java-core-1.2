public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener callFatal = System.out::println;
        Worker worker = new Worker(listener, callFatal);
        worker.start();
    }
}
