import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Deadline class represents tasks that need to be done
 * before a specific date/time.
 */
public class Deadline extends Task {
    private LocalDate by;

    /**
     * Class constructor specifying the task's description
     * and deadline.
     */
    public Deadline(String description, LocalDate by) {
        super(description, TaskType.DEADLINE);
        this.by = by;
    }

    public Deadline(String description, boolean isDone, LocalDate by) {
        super(description, isDone, TaskType.DEADLINE);
        this.by = by;
    }

    public LocalDate getBy() {
        return by;
    }

    /**
     * Returns type and description of the task.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " +
                this.by.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}