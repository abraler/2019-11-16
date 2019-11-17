public class stopThread1 {
    public static class Worker extends Thread{
        Worker(){
            super("李四");
        }
        @Override
        public void run() {
            while(!this.isInterrupted()){
                System.out.println(getName()+"正在转账");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Worker worker=new Worker();
        worker.start();
        Thread.sleep(10*1000);
        System.out.println("通知李四对方是骗子");
        worker.interrupt();
        System.out.println("通知完毕");
        worker.join();
        System.out.println("李四停止转账");

    }
}
