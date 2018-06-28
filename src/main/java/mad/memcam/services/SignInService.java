package mad.memcam.services;

import mad.memcam.entity.Login;
import mad.memcam.entity.SignIn;

import java.util.List;

public interface SignInService
{

    List<Login> listAll();

    Login getById(String id);

    SignIn saveOrUpdate(SignIn signIn);

    void delete(String id);

}