class Student{
	String studentId, studentName;
	int totalMarks;
	public void displayStudentInfo(){
		System.out.println("Student name : "+studentName);
		System.out.println("Student ID : "+studentId);
	}
	public static int makrAfterAddingMarks(int totalMarkBeforeAdding,int addingMarks){
		int TotalMarkAfterAdding= totalMarkBeforeAdding+addingMarks;
		return TotalMarkAfterAdding;
	}
	public static int makrAfterDeductMarks(int totalMarkBeforeDeducting,int deductingMarks){
		if(deductingMarks<totalMarkBeforeDeducting){
			System.out.println("Sufficient marks are available");
			int TotalMarkBeforeDeducting= totalMarkBeforeDeducting-deductingMarks;
			System.out.println("Makrs After Deduction"+totalMarkBeforeDeducting);
		}
		else{
			System.out.println("Sufficient marks are not available");	
		}
	}

	public static void main(String[] args) 
	{
		int result,addMarks,deductMarks;
		System.out.println("-------------Student no.1---------------");
		Student s1= new Student();
		s1.studentId="20Cse114";
		s1.studentName="Subendhu Nayak";
		s1.totalMarks=700;
		addMarks=0;
		deductMarks=22;
		s1.displayStudentInfo();
		result=makrAfterAddingMarks(s1.totalmarks,addMarks);
		System.out.println("Makrs After Addiction"+result);
		makrAfterDeductMarks(result,deductMarks);

	}
}
