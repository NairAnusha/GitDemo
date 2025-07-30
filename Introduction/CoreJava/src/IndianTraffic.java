
public class IndianTraffic implements CentralTraffic,Trafficmain {

	public static void main(String[] args) 
	 { 
			//CentralTraffic
          CentralTraffic a=new IndianTraffic();
          Trafficmain b=new IndianTraffic();
          b.yellowflash();
          a.redStop();
          a.greenGo();
          a.redStop();
          }
			 public void redStop() {
				 
				 System.out.println("red is stop");
		// TODO Auto-generated method stub
		
	}
	public void greenGo() {
		// TODO Auto-generated method stub
		 {
			 System.out.println("Green is for go");
			
		 }
	}
	@Override
	public void yellowflash() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow");
		
	
		if(a<20) {
			System.out.println(a);}}}
