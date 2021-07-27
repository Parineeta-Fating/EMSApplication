package com.encap;

public class SetStudentData 
{
	StudentVO setStudentData()
	{
		StudentVO svo=new StudentVO();
		svo.setSid(100);
		svo.setName("Parineeta");
		svo.setAge(21);
		svo.setGender("Female");
		svo.setCity("Nagpur");
		return svo;
	}

}
