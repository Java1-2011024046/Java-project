package sample4_11;

public class Television {

	int channel;
	int volume;
	boolean onOff;
	//output이 없을때,즉 리턴되는 데이터 타입이 없을때 void라고 적어준다.
	void pr(){
		System.out.println(channel+" "+volume+" "+onOff);	
	}
	
	/*int volumeUP(int up_data){
		int vol=volume; //20 = 20
		vol += up_data; //50
		return vol; //20
	}
	*/
		/*void volumeUP(int data){
			volume += data;
			}
		*/
	void volumeUP(int data){
		if(onOff==false){
			System.out.println("TV Die");
			return;
			}
		}
		
		void volumeUP(){
			if(onOff==false){
				System.out.println("TV Die");
				return;
				}
			volume+=1;
		} 
			
}