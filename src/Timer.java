public class Timer {
    /**
     * Class that creates a singleton time counter to keep track of gameplay time in minutes and seconds.
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

    public String getElapsedTime() {
        long elapsedTimeMillis = System.currentTimeMillis() - startTime;
        long totalSeconds = elapsedTimeMillis / 1000; // Convert milliseconds to seconds
        long minutes = totalSeconds / 60; // Calculate minutes
        long seconds = totalSeconds % 60; // Calculate remaining seconds
        return String.format("%d minutes and %d seconds", minutes, seconds); // Return formatted string
    }
}
