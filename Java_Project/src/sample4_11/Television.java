package sample4_11;

public class Television {

	int channel;
	int volume;
	boolean onOff;
	//output�� ������,�� ���ϵǴ� ������ Ÿ���� ������ void��� �����ش�.
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