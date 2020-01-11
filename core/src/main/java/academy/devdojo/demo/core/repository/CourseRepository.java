package academy.devdojo.demo.core.repository;

import academy.devdojo.demo.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
