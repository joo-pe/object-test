package designpattern.behavioral.iterator;

public class StudyGroupIterator implements Iterator {
    private Study_Group study_group;
    private int index;

    public StudyGroupIterator(Study_Group study_group)
    {
        this.study_group =study_group;
        this.index = 0;
    }

    public  boolean hasNext()
    {
        if(index < study_group.getLength())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public Object next()
    {
        Student student = study_group.getStudent(index);
        index++;
        return student;
    }
}
