package ex_5_9;

class Bank {

	double gIR(){
		return 0.0;
	}
}

class BB extends Bank{
	double gIR(){
		return 10.0;
	}
}

class NB extends Bank{
	double gIR(){
		return 5.0;
	}
}

class GB extends Bank{
	double gIR(){
		return 3.0;
	}
}
