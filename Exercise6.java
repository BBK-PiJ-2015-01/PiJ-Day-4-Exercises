public class Exercise6 {
	
	
	public static void main(String[] args) {
		
		new Exercise6().exercise6Runner();
	}
	
	private void exercise6Runner() {
		
		System.out.println("Starting test of Exercise 6");
		
		double x = 3.0;
		double y = 4.0;
		double distanceTo_0_0 = 5.0;
		double distanceTo_6_8 = 5.0;
		// 	Test creation
		Point p1 = new Point(x, y);
		assert (p1 != null);
		//	Test getters
		assert (p1.getX() == x);
		assert (p1.getY() == y);
		//	Test distance to origin  (0,0) assumed
		assert (p1.distanceToOrigin() == distanceTo_0_0);
		//  Test distance to (6,8) 
		assert (p1.distanceTo(new Point(6.0, 8.0)) == distanceTo_0_0);
		//	Test moveTo
		double newX = 6.6;
		double newY = -8474.99;
		p1.moveTo(newX, newY);
		assert (p1.getX() == newX);
		assert (p1.getY() == newY);
		//	Test  moveTo with Point
		p1 = new Point(x, y);				//	Recreate original point
		assert (p1.getX() == x);
		assert (p1.getY() == y);
		p1.moveTo(new Point(newX, newY));	// 	Perform move
		assert (p1.getX() == newX);
		assert (p1.getY() == newY);
		//	Test clone
		p1 = new Point(x, y);				//	Recreate original point
		assert (p1.getX() == x);
		assert (p1.getY() == y);
		Point p2 = p1.clone();				// Perform clone
		assert(p1 != p2);
		assert (p2.getX() == x);
		assert (p2.getY() == y);
		//
		Point p3 = p1.opposite();
		assert(p1 != p3);
		assert (p3.getX() == -x);
		assert (p3.getY() == -y);
		
		System.out.println("Completed test of Exercise 6");
	}

	
	class Point {
		
		private double x;
		private double y;
		//
		private final String nullPointMessage = " A null Point object was supplied";
		
		public Point(double x, double y) {
			
			this.x = x;
			this.y = y;
		}
		
		public double getX() {
			
			return x;
		}
		
		public double getY() {
			
			return y;
		}
		public double distanceToOrigin() {
			
			return distanceTo(new Point(0,0));
		}
		
		public double distanceTo(Point p) {
			
			if (p == null) {
				throw new IllegalArgumentException(nullPointMessage);
			}
			double xDistance = x - p.getX();
			double yDistance = y - p.getY();
			return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));			
		}
		
		public void moveTo(Point p) {
			
			if (p == null) {
				throw new IllegalArgumentException(nullPointMessage);
			}
			moveTo(p.getX(), p.getY());
		}
		
		public void moveTo(double x, double y) {
			
			this.x = x;
			this.y = y;
		}
		
		public Point clone() {
			
			return new Point(x,y);
		}
		
		public Point opposite() {
			
			Point returnClone = clone();
			returnClone.moveTo(-x, -y);
			return returnClone;
		}
	}	
}