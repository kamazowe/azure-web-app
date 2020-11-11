package kamazowe.azurewebapp;

import com.sun.istack.NotNull;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tasks")
class SqlTask {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @NotNull
    private String description;
    private boolean done;
    private ZonedDateTime deadline;
    private int changesCount;
    private String additionalComment;

    @PersistenceConstructor
    protected SqlTask() {
    }


    public SqlTask(String description, ZonedDateTime deadline) {
        this.description = description;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(final boolean done) {
        this.done = done;
    }

    public ZonedDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(final ZonedDateTime deadline) {
        this.deadline = deadline;
    }

    public int getChangesCount() {
        return changesCount;
    }

    public void setChangesCount(final int changesCount) {
        this.changesCount = changesCount;
    }

    public String getAdditionalComment() {
        return additionalComment;
    }

    public void setAdditionalComment(final String additionalComment) {
        this.additionalComment = additionalComment;
    }
}
