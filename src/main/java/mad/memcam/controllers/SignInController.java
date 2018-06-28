package mad.memcam.controllers;

import mad.memcam.entity.Address;
import mad.memcam.entity.Login;
import mad.memcam.entity.SignIn;
import mad.memcam.services.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignInController {

    @Autowired
    SignInService signInService;

    @RequestMapping({"/updateSign"})
    public ResponseEntity<SignIn> updateSignIn(Model model){
        Login login = new Login();
        login.setUserName("Login");
        login.setPassWord("Password");
        SignIn signIn = new SignIn();
        signIn.setName("name");
        signIn.setPhoneNumber("9988776655");
        signIn.setGender("male");
        signIn.setLogin(login);
        Address address = new Address();
        address.setLine1("line1");
        address.setDistrict("district");
        address.setPinCode("888777");
        signIn.setAddress(address);
        SignIn signIns = signInService.saveOrUpdate(signIn);
        if(signIns == null)
            return new ResponseEntity<SignIn>(new SignIn(), HttpStatus.OK);
        else
            return new ResponseEntity<SignIn>(signIns, HttpStatus.OK);
    }
}
