package designpattern.behavioral.iterator;

public class Study_Group implements Aggregate{

    private Student[] Students;
    private int num =0;

    public Study_Group(int num)
    {
        this.Students = new Student[num];
    }
    public Student getStudent(int index)
    {
        return Students[index];
    }
    public void AddStudnet(Student student)
    {
        this.Students[num] = student;
        num++;
    }
    public int getLength()
    {
        return num;
    }

    public StudyGroupIterator iterator()
    {
        return new StudyGroupIterator(this);
    }
}
