package singleton;

//The constructor is private in order to prevent the use of "new" in other classes
//It's set to static to enable global reach
class MakeACaptain {
	private static MakeACaptain captain;
	private MakeACaptain() {}
	public static MakeACaptain getCaptain() {
		if(captain == null) {
			captain = new MakeACaptain();
			System.out.println("New Captain selected for our team");
		}
		else {
			System.out.println("You already have a captain for your team\nSend him for the toss!");
		}
		return captain;
	}
}
