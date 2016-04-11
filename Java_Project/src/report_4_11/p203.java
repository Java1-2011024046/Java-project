package report_4_11;

public class p203 {
 int channel;
 int volume;
 boolean onOff;
 
 public static void main(String[] args){
	 p203 tv = new p203();
	 tv.channel=7;
	 tv.volume = 10;
	 tv.onOff=true;
	 System.out.println("텔레비전의 채널은"+tv.channel+"이고 볼륨은"+tv.volume+"입니다.");
 }
}
