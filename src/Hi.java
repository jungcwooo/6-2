class E6_4 {
	static double gatDistance(int x, int y, int x1, int y1) {
		
		return (((y1-y)^2) + ((x1 - x)^2));
		
	}
	public static void main(String[] arge) {
		System.out.println(gatDistance(1, 1, 2, 2));
	}
}
