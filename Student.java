class Student {
	String index;
	String firstName;
	String lastName;
	String[] grades;
	int n;
	
	//TODO constructor
	public Student(String index,String firstName, String lastName){
			this.index=index;
			this.firstName=firstName;
			this.lastName=lastName;
	}
	
	//TODO seters & getters
	public String getindex() {
	    return index;
	  }
	public void setindex(String index) {
	    this.index = index;
  }
	public String getfirstName() {
		    return firstName;
	  }

	public void setfirstName(String fn) {
		    this.firstName = firstName;
	  }
	public String getlastName() {
			    return lastName;
	 }	
	public void setlastName(String lastName) {
	    this.lastName = lastName;
  }	  

	public double getAverage() {
		//TODO
		int average;
		int sum=0;
		
		
		for(int i=0;i<n;i++) {
			sum+=grades[i];
		}
		average=sum/n;
		return average;
	}

	public int ECTSCredits() {
		//TODO
		int ekts;
		for(int i=0;i<n;i++)
		{
			ekts*=6;
		}
		return ekts;
	}
}
