package mad.memcam.services;

import mad.memcam.entity.Login;

import java.util.List;


public interface LoginService {

    List<Login> listAll();

    Login getById(String id);

    Login saveOrUpdate(Login login);

    void delete(String id);

}