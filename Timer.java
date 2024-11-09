public class Timer {
    /**
     * Class that creates a singleton time counter to keep track of gameplay seconds
     */
    private static Timer instance;
    private long startTime;

    private Timer() {

        startTime = System.currentTimeMillis();
    }

    public static Timer getInstance() {
        if (instance == null) {
            synchronized (Timer.class) {
                if (instance == null) {
                    instance = new Timer();
                }
            }
        }
        return instance;
    }

    public long getElapsedTime() {
        long elapsedTimeMillis = System.currentTimeMillis() - startTime;
        return elapsedTimeMillis / 1000; // Convert milliseconds to seconds
    }
}

