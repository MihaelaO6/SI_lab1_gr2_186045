class Student {
	String index;
	String firstName;
	String lastName;
	String[] grades;

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
	}

	public int ECTSCredits() {
		//TODO
	}
}
