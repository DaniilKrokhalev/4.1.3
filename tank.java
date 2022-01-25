public class Tank {

	int x, y;
	int dir;
	int fuel = 100;
   public Tank() {
   }
   
    public Tank(int x2, int y2) {
        this.x = x2;
        this.y = y2;
    }
    public Tank(int x3, int y3, int fuel2) {
        this.x = x3;
        this.y = y3;
        this.fuel = fuel2;
    }

	public void goForward(int i) {
		int realDistance = i > fuel ? fuel : i;
		    if (dir == 0) x += realDistance;
		    else if (dir == 1) y += realDistance;
		    else if (dir == 2) x -= realDistance;
		    else y -= realDistance;
		    fuel -= realDistance;
	    
	    
	}
	public void printPosition() {
		System.out.println("The Tank is at " + x +", " + y + " now.");
	}

	public void turnLeft() {
		dir--;
        if (dir == -1) dir = 3;
	}

	public void turnRight() {
		dir++;
		if (dir == 4) dir = 0;
	}

	public void goBackward(int i) {
        goForward(-i);
	}
}
