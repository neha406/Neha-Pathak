class Restaurant
{
	String cuisine;
	String theme;
void display()
{
  System.out.println("Hello sir");
    System.out.println("welcome to hotel radison");
    System.out.println("todays special:shahi paneer");
    System.out.println("Thanks for visiting.see you again");  
}
     }

      class Testrest
    {

    public static void main(String[] args){
    	
	Restaurant Kejo=new Restaurant();
	Kejo.display();

    Restaurant namo=new Restaurant();
    System.out.println("Namo in house");
    namo.display();

    Restaurant RG=new Restaurant();
    RG.display();
}
}