public class Student{
	private Integer id;
	private String name;
	private Integer age;
	private String classes;

	public void setId(Integer id){
		thid.id=id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public String toString(){
		return "Student [id="+this.id+",name="+this.name+"]";
	}


}

