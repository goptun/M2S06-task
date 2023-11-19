package org.senai.m2s06.task.database;

import org.senai.m2s06.task.exception.NotFoundException;
import org.senai.m2s06.task.model.Task;
import org.senai.m2s06.task.model.enums.PriorityEnum;
import org.senai.m2s06.task.model.enums.StatusEnum;

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

    public static Task getByStatus(StatusEnum statusEnum) throws NotFoundException {
        return Database.tasks.stream()
                .filter(task -> task.getStatus().equals(statusEnum))
                .findFirst().orElseThrow(() -> new NotFoundException("Nenhuma tarefa com esse status."));
    }

    public static Task getByPriority(PriorityEnum priorityEnum) throws NotFoundException {
        return Database.tasks.stream()
                .filter(task -> task.getPriority().equals(priorityEnum))
                .findFirst().orElseThrow(() -> new NotFoundException("Nenhuma tarefa com essa prioridade."));
    }

    public static Task getByAssigneeName(String assigneeName) throws NotFoundException {
        return Database.tasks.stream()
                .filter(task -> task.getAssigneeName().equals(assigneeName))
                .findFirst().orElseThrow(() -> new NotFoundException("Nenhuma tarefa para esse responsável"));
    }

    public static Integer setId() {
        Database.nextId = Database.nextId + 1;
        return Database.nextId;
    }


}