package OOPS;

public class Student {
        String name;
        int rollNo;
        String collegeName;
        public Student(){
            //Default cont
        }
        public Student(String name, int rollNo, String collegeName){
            this.name = name;
            this.rollNo = rollNo;
            this.collegeName = collegeName;
        }

        public void printdata(){
            System.out.println(name+ ", "+ rollNo + ", "+ collegeName);
        }
    }