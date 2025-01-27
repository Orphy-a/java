package test6.sub01;


class StudentScore {
	
	private String studnetName;
	private String studnetId;
	private String subject;
	private double score;
	
	public StudentScore(String studnetName, String studnetId, String subject, double score) {
		this.studnetName = studnetName;
		this.studnetId = studnetId;
		this.subject = subject;
		this.score = score;
	}
	
	
	
	public void updateScore(double score) {
		if(score>100 || score<0) {
			System.out.println("잘못된 점수 입력");
		} else {
			this.score = score;
			System.out.println("점수 수정완료");
		}
		
	}
	
	
	public double getScore() {
		return score;
	}
	
	
	public void printStudentInfo() {
		System.out.println("이름 : " + studnetName);
		System.out.println("ID : " + studnetId);
		System.out.println("과목명 : " + subject);
		System.out.println("점수 : " + score);
		
	}
	
}



