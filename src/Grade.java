
public class Grade {
	private int number;
	private String letter;
	
	public Grade() {
		this.number = 0;
	}
	public Grade(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	public String determineLetterGrade() {
		if (this.getNumber() < 60) {
			return letter = "F";
		} 
		else if (this.getNumber() < 67) {
			return letter = "D";
		}
		else if (this.getNumber() < 80) {
			return letter = "C";
		}
		else if (this.getNumber() < 88) {
			return letter = "B";
		}
		else {
			return letter = "A";
		}
	}	
}
