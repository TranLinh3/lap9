package bank;
import java.util.concurrent.locks.ReentrantLock;
public class IdGenerate {
    private static Long id = 0L;
    public static ReentrantLock lock = new ReentrantLock();
    public static Long getNewID(){
        Long result;
        lock.lock();
        //khóa biến id lại chỉ cho duy nhất 1 thread được truy xuất cập
        //để tránh tình trạng Data Racing
        try {
            result = ++ id;
            //tăng rồi gán vào result
        }
        finally {
            lock.unlock();
            //tăng rồi thì mở lock cho thread khác cùng truy cập
            //nhiều như mình dùng xong thì đi ra
        }
        return result;
    }
    private IdGenerate(){
    }
}
