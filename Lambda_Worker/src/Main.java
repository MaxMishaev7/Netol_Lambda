public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Worker!");
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorCallback = (int x) -> {int errorCode = 33;
            if (x == errorCode) {
                System.out.println("ERROR! Task " + x + " cannot be done");
                return true;
            } else {
                return false;
            }
        };

        Worker worker = new Worker(listener, errorCallback);
        worker.start();
    }

}