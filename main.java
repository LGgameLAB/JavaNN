class main {
	public static void main(String[] args){
		double[] inputVector = {1.66, 1.56};
		double[] weights1 = {1.45, -0.66};
		double[] weights2 = {2.17, 0.32};

		double bias = 0.0;


		double dotProduct1 = NeuroMath.dotProd(inputVector, weights1) + bias;
		dotProduct1 = NeuroMath.sigmoid(dotProduct1);
		System.out.printf("The dot product is: %f", dotProduct1);
	}
}

class NeuroMath {
	static final double E = 2.718281828459;
	public static double dotProd(double x1, double y1, double x2, double y2){
		return x1 * x2 + y1 * y2;
	}
	public static double dotProd(double[] arr1, double[] arr2){
		double x1 = arr1[0];
		double y1 = arr1[1];
		double x2 = arr2[0];
		double y2 = arr2[1];
		return x1 * x2 + y1 * y2;
	}
	public static double sigmoid(double x){
		return 1.0 / (1.0 + Math.exp(-1.0*x));
	}
}