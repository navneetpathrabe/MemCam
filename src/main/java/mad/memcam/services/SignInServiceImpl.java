package mad.memcam.services;

import mad.memcam.entity.Login;
import mad.memcam.entity.SignIn;
import mad.memcam.repositories.SignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignInServiceImpl implements SignInService{

    @Autowired
    SignInRepository signInRepository;

    @Override
    public List<Login> listAll() {
        return null;
    }

    @Override
    public Login getById(String id) {
        return null;
    }

    @Override
    public SignIn saveOrUpdate(SignIn signIn) {
        signInRepository.save(signIn);
        return signIn;
    }

    @Override
    public void delete(String id) {

    }
}
