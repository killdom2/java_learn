import java.util.Scanner;
import java.util.Arrays;

// ������� ������ � ������ ���� (� ��� � ������ ��������)
// �������� ����� ����, ���� ���
// ������������ ����� ���� int = 2147483647

class PerevodStrokiVCifirki{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �����:\t\t");
		
		String str = scan.nextLine();
		int numNums = 0; 												// ���������� ���� � ������
		
		char[] chArr = new char[str.length()];							// ������ �� ������ ������ ��������
		
		for (int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
			if (chArr[i] >= 48 && chArr[i] <= 57) numNums++;			// ������� ���������� ���� � ������
			//System.out.print(chArr[i]);
		}
		
		System.out.println("���������� ����:\t" + numNums);
		int j = 0;														// ������ ������� ����
		char[] newCh = new char[numNums];
		
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 48 && chArr[i] <= 57) {						// ���� ������ - �����, �� ���� �����
				newCh[j] = chArr[i];									// � ����� ������
				//System.out.print(newCh[j]);
				j++;
			}
		}
		
		System.out.println("������ ��������:\t" +						// ������ ���� ���������� numsArr[],
							  Arrays.toString(newCh));					// ���������� � ���� ��������������
		int[] numsArr = new int[newCh.length];
		
		for (int i = 0; i < newCh.length; i++) {
			numsArr[i] = newCh[i] - 48;
		}

		System.out.println("������ �����:\t\t" + Arrays.toString(numsArr));
		
		// � ���������� ������� ������� ���� � ����� ���� Int.
		
		int numFromArr = 0;
		j = 0;
		
		for (int i = numsArr.length-1; i >= 0; i--) {
			numFromArr += numsArr[i] * Math.pow(10, j);
			j++;
		}
		
		System.out.print("������� �����:\t\t" + numFromArr + 
							"\n��� ����� ����, ������.");
		
		scan.close();
	}
}