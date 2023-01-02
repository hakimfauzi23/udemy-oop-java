package hanif.hakim.dev.application;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            String[] names = {
                    "Hanif", "Fauzi", "Hakim"
            };

            System.out.println(names[100]);
        } catch (Throwable th) {
            StackTraceElement[] stackTraceElements = th.getStackTrace();

            /*
             * use for trace error!
             */
            th.printStackTrace();
        }

        try {
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace(); // posibble to track multiple 
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Hanif", "Fauzi", "Hakim"
            };

            System.out.println(names[100]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
