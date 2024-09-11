package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        HelloThread helloThread = new HelloThread();
        System.out.println("start 호출 전");
        helloThread.start();
        System.out.println("start 호출 후");

    }
}
