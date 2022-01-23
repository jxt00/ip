package duke.task;

/**
 * Task class represents the tasks created by the user.
 * It keeps track of the task's description and its status.
 */
public class Task {
    private String description;
    private boolean isDone;
    private TaskType type;

    /**
     * Creates a task with the given data.
     *
     * @param description Description of the task to be created.
     * @param type Type of the task to be created.
     */
    public Task(String description, TaskType type) {
        this.description = description;
        this.isDone = false;
        this.type = type;
    }

    /**
     * Creates a task with the given data.
     *
     * @param description Description of the task to be created.
     * @param isDone Status of the task to be created.
     * @param type Type of the task to be created.
     */
    public Task(String description, boolean isDone, TaskType type) {
        this.description = description;
        this.isDone = isDone;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    /**
     * Returns status icon "X" of the task.
     * If the task is not done, " " is returned.
     *
     * @return Status icon.
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    /**
     * Marks a task as done.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Unmarks a task as done.
     */
    public void unmarkAsDone() {
        this.isDone = false;
    }

    public TaskType getType() {
        return type;
    }

    /**
     * Returns a prefix denoting the task type.
     *
     * @return Prefix of the task type.
     */
    public String getTypeAsPrefix() {
        switch(type) {
        case DEADLINE:
            return "D";
        case EVENT:
            return "E";
        default:
            return "T";
        }
    }

    /**
     * Returns status icon and description of the task.
     */
    @Override
    public String toString() {
        return "[" + getStatusIcon() + "] " + this.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Task task = (Task) o;

        if (isDone != task.isDone) {
            return false;
        }
        if (!description.equals(task.description)) {
            return false;
        }
        return type == task.type;
    }
}