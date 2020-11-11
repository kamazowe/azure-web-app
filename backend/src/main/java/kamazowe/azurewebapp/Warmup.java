package kamazowe.azurewebapp;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component("taskWarmup")
class Warmup implements ApplicationListener<ContextRefreshedEvent> {

    private final SqlTaskRepository repository;

    public Warmup(SqlTaskRepository taskRepository) {
        this.repository = taskRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (repository.count() == 0) {
            var task = new SqlTask("Example task", ZonedDateTime.now());
            repository.save(task);
            var task2 = new SqlTask("Example tas2k", ZonedDateTime.now());
            repository.save(task2);
        }
    }
}
