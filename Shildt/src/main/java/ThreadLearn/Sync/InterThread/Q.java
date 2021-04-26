package ThreadLearn.Sync.InterThread;

class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
           try {
               wait();
           } catch (InterruptedException e){
               e.printStackTrace();
           }

        System.out.println("Got: " + n);
           notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.n = n;
        System.out.println("Put: " + n);
    }
}



