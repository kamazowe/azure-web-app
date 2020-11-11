package kamazowe.azurewebapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/tasks")
class TaskController {
    private final SqlTaskRepository repository;

    TaskController(final SqlTaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    ResponseEntity<List<SqlTask>> list() {
        var r = new ArrayList<>(repository.findAll());
        return ResponseEntity.ok(r);
    }


    @PostMapping
    ResponseEntity<SqlTask> create(@RequestBody SqlTask toCreate) {
        SqlTask result = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<SqlTask> delete(@PathVariable int id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
