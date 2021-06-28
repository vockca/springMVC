package vladislav.dashkovskiy.testTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class WorkerDto {
    public String name;

    public int age;

    public List<String> skills;

    public boolean busy;

    public String organization;
}
