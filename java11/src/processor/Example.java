package processor;

public class Example {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("å½“å‰�è¿›ç¨‹çš„ PID = " + currentProcess.pid());
    }

}
