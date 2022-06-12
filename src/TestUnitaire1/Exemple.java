package TestUnitaire1;

public class Exemple {

	private int a ;
	private int b;
	public Exemple(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	public int calculer(){
		int res=a+b;
		
		if(a==0){
			res=b*2;
		}
		if(b==0){
			res=a*a;
		}
		if(a==0 || b==0){
			res=b*b;
		}
		if(a!=0 || b!=0){
			res=a*b;
		}
		return res;
	}
	

	
	
}
