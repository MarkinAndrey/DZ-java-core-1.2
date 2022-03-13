public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener callFatal;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callFatal) {
        this.callback = callback;
        this.callFatal = callFatal;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                callFatal.onError("Task " + i + " is fatal");
            }
        }
    }
}
