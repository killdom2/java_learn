import java.util.Scanner;
import java.util.Arrays;

// Перевод строки в массив цифр (и тут я знатно прифигел)
// Очевидно через жопу, зато своё
// Максимальное число типа int = 2147483647

class PerevodStrokiVCifirki{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Жмякай давай:\t\t");
		
		String str = scan.nextLine();
		int numNums = 0; 												// Количество цифр в строке
		
		char[] chArr = new char[str.length()];							// Создаём из строки массив символов
		
		for (int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
			if (chArr[i] >= 48 && chArr[i] <= 57) numNums++;			// Считаем количество цифр в строке
			//System.out.print(chArr[i]);
		}
		
		System.out.println("Количество цифр:\t" + numNums);
		int j = 0;														// Индекс массива цифр
		char[] newCh = new char[numNums];
		
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 48 && chArr[i] <= 57) {						// Если символ - цифра, то ходи давай
				newCh[j] = chArr[i];									// в новый массив
				//System.out.print(newCh[j]);
				j++;
			}
		}
		
		System.out.println("Массив символов:\t" +						// Массив цифр называется numsArr[],
							  Arrays.toString(newCh));					// обращаться к нему соответственно
		int[] numsArr = new int[newCh.length];
		
		for (int i = 0; i < newCh.length; i++) {
			numsArr[i] = newCh[i] - 48;
		}

		System.out.println("Массив чисел:\t\t" + Arrays.toString(numsArr));
		
		// И напоследок перевод массива цифр в число типа Int.
		
		int numFromArr = 0;
		j = 0;
		
		for (int i = numsArr.length-1; i >= 0; i--) {
			numFromArr += numsArr[i] * Math.pow(10, j);
			j++;
		}
		
		System.out.print("Искомое число:\t\t" + numFromArr + 
							"\nВот такие дела, малята.");
		
		scan.close();
	}
}