package mad.memcam.services;
import mad.memcam.entity.Login;
import mad.memcam.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginRepository loginRepository;

    @Override
    public List<Login> listAll() {
        List<Login> logins = new ArrayList<>();
        loginRepository.findAll().forEach(logins::add); //fun with Java 8  // logins.add(x);
        System.out.println("I am Navneet making some changes");
        return logins;

    }

    @Override
    public Login getById(String id) {
        return loginRepository.findById(id).orElse(null);  // Java 8
    }

    @Override
    public Login saveOrUpdate(Login login) {
        loginRepository.save(login);
        return login;
    }

    @Override
    public void delete(String id) {
        loginRepository.deleteById(id);
    }

}

