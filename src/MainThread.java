public class MainThread implements Runnable{
    private String thrName;
    private Thread mainThread;
    private String action = "c";
    private CreateThread createThread;

    public MainThread(String thrName) {
        this.thrName = thrName;
        System.out.println("MainThread class created with name " + thrName);
    }

    @Override
    public void run() {
        System.out.println("Main thread");
        createThread.start(action);
        try {
            createThread.thrCreate.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(String value){
        createThread = new CreateThread(value);
        mainThread = new Thread(this,thrName);
        mainThread.start();
    }

    public String getThrName() {
        return thrName;
    }

    public Thread getMainThread() {
        return mainThread;
    }


}
