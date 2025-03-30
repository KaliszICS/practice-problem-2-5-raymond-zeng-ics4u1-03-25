public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void insertionSort(char[] characters){
		for (int j = 1;j < characters.length;j++){
			char key = characters[j];
			int index = j-1;
			while (index >= 0 && key < characters[index]){
				characters[index + 1] = characters[index];
				index--;
			}
			characters[index + 1] = key;
		}
		}
	}

