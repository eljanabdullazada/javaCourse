package Proteus.MentorLesson6;

import java.util.ArrayList;
import java.util.List;

public class TaskFourOptional <T>{

    private List<T> genericList;

    public TaskFourOptional(){
        genericList = new ArrayList<>();
    }

    public void addToList(T input){
        genericList.add(input);
    }

    public void removeFromList(T input){
        genericList.remove(input);
    }

    public T get(int index){
        return genericList.get(index);
    }

    public List<T> getAll(){
        return new ArrayList<>(genericList);
    }
}
