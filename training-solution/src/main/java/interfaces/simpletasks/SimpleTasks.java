package interfaces.simpletasks;

import interfaces.Runnable;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {

    private List<String> tasks = new ArrayList<>();

    @Override
    public void run() {
        while(!tasks.isEmpty()){
            nextStep();
        }

    }

    public List<String> getTasks() {
        return tasks;
    }

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    private void nextStep(){
        if(tasks != null && !tasks.isEmpty()){
            tasks.remove(tasks.size()-1);
        }
    }
}
