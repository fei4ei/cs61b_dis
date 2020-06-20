public class dis01{
	public static int mystery(int[] inputArray, int k) {
		// find the minimal element from (at or after) inputArray[k] to inputArray[inputArray.length-1]
		int x = inputArray[k];
		int answer = k;
		int index = k + 1;
		while (index < inputArray.length) {
			if (inputArray[index] < x) {
				x = inputArray[index];
				answer = index;
			}
			index = index + 1;
		}
		return answer;
	}
	
	public static void mystery2(int[] inputArray) {
		// selection sort from smallest to the largest
		int index = 0;
		while (index < inputArray.length) {
			int targetIndex = mystery(inputArray, index);
			int temp = inputArray[targetIndex];
			inputArray[targetIndex] = inputArray[index];
			inputArray[index] = temp;
			index = index + 1;
		}
	}
	
	public static void main(String[] args) {
		int[] input = new int[]{3, 0, 4, 6, 3, 2};
		int k = 2;
		System.out.println(mystery(input, k));
		mystery2(input);
		System.out.println(java.util.Arrays.toString(input));
	}
}
