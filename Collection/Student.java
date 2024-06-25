package Collection;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    public Student(int rn,String nm)
    {
        rollNo=rn;
        name=nm;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }
    @Override
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);
    }
    
    
}
