public class CreateThread implements Runnable {
    Thread thrCreate;
    String thrName;

    public CreateThread(String thrName) {
        this.thrName = thrName;
    }

    public void start(String action){
        if (action.equalsIgnoreCase("c") && thrCreate==null){
            thrCreate = new Thread(this,thrName);
            thrCreate.start();
        }
    }


    public Thread getThrCreate() {
        return thrCreate;
    }

    public String getThrName() {
        return thrName;
    }

    @Override
    public void run() {
        System.out.println("Running method " + thrName);
    }
}
