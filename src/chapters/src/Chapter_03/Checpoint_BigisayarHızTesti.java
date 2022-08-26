package Chapter_03;

public class Checpoint_BigisayarHızTesti {
	public static void main(String[] args) {
		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(System.currentTimeMillis());
		}
	}

}

