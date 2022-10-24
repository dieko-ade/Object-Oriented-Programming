import java.util.Vector;

class Producer extends Thread {
    // initialization of the queue size
    static final int MAX = 7;
    private Vector messages = new Vector();

    @Overide
    public void run() {
        try {
            while (true) {
                // producing a message to send to the consumer
                putMessage();

                // producer goes to sleep when the queue is full
                sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }

    private synchronized void putMessage() {
        throws InterruptedException {
            // checks whether the queue is full or not
            while (messages.size() == MAX) {
                // waits for the queue to free up space
                wait();

                // then again adds element or messages
                messages.addElement(new java.util.Date().toString());
                notify();
            }
        }
    }
}