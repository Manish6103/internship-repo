package com.ServiceRegistery;

class Student{
    private int[] marks;
    private char[] grade;

    public Student(int[] marks){
        this.marks = marks;
        this.grade= new char[marks.length];
    }
    public int[] getMarks(){
        return marks;
    }
    public char[] getGrade(){
        return grade;
    }

    public void setMarks(int[] marks){
        this.marks= marks;
    }
    public void setGrade(char[] grade){
        this.grade= grade;
    }

    public void findGrade(){
        for(int i=0;i<marks.length;i++ ){
            int m = marks[i];
            if(m>=92){
                grade[i] ='E' ;
            }else if(m>=85){
                grade[i] ='A';
            }else if(m>=70){
                grade[i] ='B';
            }else if(m>=65){
                grade[i] ='C';
            }else{
                grade[i]='D';
            }
        }
    }
}

class Grade{
    public static void main(String[] args) {
        int[] marks = { 79, 87, 97, 65, 78, 99, 66 };
        Student student = new Student(marks);
        student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
        char[] grades = student.getGrade();
        for (int index = 0; index < grades.length; index++) {
            System.out.print(grades[index] + " ");
        }
    }
}




