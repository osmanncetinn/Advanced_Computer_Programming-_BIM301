package tr.edu.halic.work;

public enum Words {

	TEKNOLOJI("teknoloji");


	private Words(String word) {
		this.word = word;
	}
	
	private String word;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	

}


