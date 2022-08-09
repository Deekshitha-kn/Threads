
class MyThread1 extends Thread {
    @Override
    public void run(){
        While(true);
        {
            System.out.println("This is my first thread");
        }
    }

	private void While(boolean b) {
	}
}

class MyThread2 extends Thread {
    @Override
    public void run(){
        While(true);
        {
            System.out.println("This is second thread");
        }
    }

	private void While(boolean b) {
	}
}

public class multithread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}