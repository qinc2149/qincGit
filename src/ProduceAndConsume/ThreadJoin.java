package ProduceAndConsume;
/**
 * @author Qinc
<<<<<<< HEAD
 * 演示join
 * 没写完,试一下
 * 
 * 
 * 第二次提交，实验一下合并分支的操作
=======
 * 婕旂ずjoin
 * 娌″啓瀹�,璇曚竴涓�
 * 
 * 
 * 绗簩娆℃彁浜わ紝瀹為獙涓�涓嬪悎骞跺垎鏀殑鎿嶄綔
 * 
 * 绗笁娆′簡鍟﹀暒鍟﹀暒鍟﹀暒
>>>>>>> myTest
 *
 */

public class ThreadJoin {
	public static void main(String[] args) {
		task tk = new task();
		Thread t1= new Thread(tk);
		t1.start();
		//Thread.
<<<<<<< HEAD
		System.out.println(Thread.currentThread()+"主线程在执行结束！");
=======
		System.out.println(Thread.currentThread()+"涓荤嚎绋嬪湪鎵ц缁撴潫锛�");
>>>>>>> myTest
	}	
}
class task implements Runnable{

	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
<<<<<<< HEAD
			System.out.println(Thread.currentThread()+"子线程在执行；");
=======
			System.out.println(Thread.currentThread()+"瀛愮嚎绋嬪湪鎵ц锛�");
>>>>>>> myTest
		}
		
	}
	
}