package org.senai.m2s06.task.database;

import org.senai.m2s06.task.model.Task;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Integer nextId = 0;
    private static List<Task> tasks = new ArrayList<>();

    public static void add(Task task) {
        Database.tasks.add(task);
    }

    public static void remove(Integer id) {
        Database.tasks.removeIf(task -> task.getId().equals(id));
    }

    public static List<Task> listAll() {
        return Database.tasks;
    }

    public static Integer setId() {
        Database.nextId = Database.nextId + 1;
        return Database.nextId;
    }


}