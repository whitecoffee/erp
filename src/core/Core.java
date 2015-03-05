package core;

import java.io.File;

import com.asprise.ocr.Ocr;

public class Core {
	public static void main(String[] args) {
		
		Ocr.setUp();
		Ocr ocr = new Ocr();
		ocr.startEngine("eng", Ocr.SPEED_FASTEST);
		String s = ocr.recognize(new File[] {new File("D:\\asprise-ocr-java-5.01\\img\\test.png")}, Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println("Result: " + s);
		ocr.stopEngine();
		/*String input = JOptionPane
				.showInputDialog("How many numbers do you need to draw?");
		int k = Integer.parseInt(input);

		input = JOptionPane
				.showInputDialog("What is the highest number you can draw?");
		int n = Integer.parseInt(input);

		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;

		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			int r = (int) (Math.random() * n);
			result[i] = numbers[r];
			numbers[r] = numbers[n - 1];
			n--;
		}

		Arrays.sort(result);
		System.out
				.println("Bet the following combination. It'll make you rich!");
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
		System.exit(0);*/
	}
}
