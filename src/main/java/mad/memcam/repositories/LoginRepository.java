package mad.memcam.repositories;

import mad.memcam.entity.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, String> {
}
