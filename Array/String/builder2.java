package String;

public class builder2 {
    public static void main(String[] arge) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        task t1 = new task(sb);
        task t2 = new task(sb);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(" final length : " + sb.length());


    }

    static class task extends Thread {
        private StringBuilder sb;

        public task(StringBuilder sb) {
            this.sb = sb;
        }


        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                sb.append("a");
            }
        }
    }
}