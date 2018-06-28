package mad.memcam.repositories;

import mad.memcam.entity.SignIn;
import org.springframework.data.repository.CrudRepository;

public interface SignInRepository extends CrudRepository<SignIn, String > {
}
