package com.ServiceRegistery;

class Teacher {
    private String teacherName;
    private String subject;
    private double salary;

    public Teacher( String teacherName,String subject, double salary ){
        this.teacherName=teacherName;
        this.subject=subject;
        this.salary=salary;
    }

    public String getTeacherName(){
        return teacherName;
    }
    public String getSubject(){
        return subject;
    }
    public double getSalary(){
        return salary;
    }
    public void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}

class TeacherInfo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alex","Java Fundamentals",1200);
        Teacher t2 = new Teacher("John","RDMS",800);
        Teacher t3 = new Teacher("Sam","Networking",900);
        Teacher t4 = new Teacher("Maria","Python",900);

        Teacher[] Teachers = {t1,t2,t3,t4};

        for(Teacher t : Teachers){
            System.out.println("Name: "+ t.getTeacherName()+", Subject:"+t.getSubject()+", Salary:"+t.getSalary());
        }
    }
}

