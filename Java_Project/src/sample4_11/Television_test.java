package sample4_11;

public class Television_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Television mytv = new Television();
	Television yourtv = new Television();
	Television testtv = mytv;
	
	mytv.channel=18;
	mytv.volume=20;
	mytv.onOff=true;
	
	//mytv.onOff=false;
	
	//mytv.volume=mytv.volumeUP(20);
	//return �ִ°ɷ� �ڵ�¥���� Television���� §��
	mytv.volumeUP();
	//return ���� �ɷ� �ϸ�ȴ�.
	
	//System.out.println(mytv.channel+" "+mytv.volume+" "+mytv.onOff);
	mytv.pr();
	
	yourtv.channel=11;
	yourtv.volume=30;
	yourtv.onOff=true;
	
	//System.out.println(yourtv.channel+" "+yourtv.volume+" "+yourtv.onOff);
	yourtv.pr();
	
	
	
	System.out.println(testtv.channel+" "+testtv.volume+" "+testtv.onOff);
	testtv=null;
	
	}

}
