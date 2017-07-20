package Annotation.anno2;

/**
 * Created by shaobo.su on 2017/7/19.
 */
public class SequenceNumber {
    private static ThreadLocal<Integer> seqlNum=new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };

    public int getNextNum(){
        seqlNum.set(seqlNum.get()+1);
        return seqlNum.get();
    }
    public static void main(String[] args){
        SequenceNumber sn=new SequenceNumber();
        TestClient testClient1 = new TestClient(sn);
        TestClient testClient2 = new TestClient(sn);
        TestClient testClient3 = new TestClient(sn);
        testClient1.start();
        testClient2.start();
        testClient3.start();

    }
  private static class TestClient extends Thread{
      private SequenceNumber sn;
      public TestClient(SequenceNumber sn){
          this.sn=sn;
      }
      public void run(){
          for(int i=0;i<3;i++){
              System.out.println("thread[" + Thread.currentThread().getName() + "]sn[" + sn.getNextNum());
          }
      }
  }

}
