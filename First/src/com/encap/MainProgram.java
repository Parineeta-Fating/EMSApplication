package com.encap;

public class MainProgram {
	 
    public static void main(String[] args) {

        StudentVO svo=null;
        SetStudentData get=new SetStudentData();
        svo=get.setStudentData();        
        DisplayStudent disp=new DisplayStudent();
        disp.display(svo);
    }
 
}


