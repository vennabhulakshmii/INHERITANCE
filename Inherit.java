class Guest{
	public void read(){
		System.out.println("he is reading only");
	}
}
class Developer extends Guest{
       
	
	public void read(){
		super.read();
		System.out.println("he is updating");

	}
	public void write(){
		System.out.println("he is writing");
       }
}
 class Admin extends Developer{
	public void manage(){
		System.out.println("he is managing");
        }
     }
public class Inherit{
	public static void main(String[] args){
		Guest g=new Guest();
		 g.read();
		Developer d=new Developer();
		d.read();
		d.write();
		Admin a=new Admin();
		a.read();
		a.write();
		a.manage();
}
}