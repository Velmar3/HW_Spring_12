package ru.gb.taskmanagement.util.builder;

import ru.gb.taskmanagement.model.Task;

public class TaskBuilder {

  private final Task task;

  public TaskBuilder() {
    this.task = new Task();
  }

  public TaskBuilder setName(String name) {
    task.setName(name);
    return this;
  }

  public TaskBuilder setDescription(String description) {
    task.setDescription(description);
    return this;
  }

  public Task build() {
    return task;
  }
}
