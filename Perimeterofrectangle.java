public class Perimeterofrectangle{
	int length;
	int width;
	void insert(int l, int w) {
		length = l;
		width =w;
	}
	void CalculatePerimeter() {
		System.out.println(2*(length + width));
	}
	public class Perimeterofrectangle1{
		public static void main(String args[]) {
			PerimeterofRectangle r1=new PerimeterofRectangle();
			r1.insert(9,5);
			r1.CalculatePerimeter();
		}
		}
	}
