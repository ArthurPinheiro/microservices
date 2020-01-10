package academy.devdojo.demo.repository;

import academy.devdojo.demo.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
