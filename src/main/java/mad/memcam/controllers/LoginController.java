package mad.memcam.controllers;

import mad.memcam.commands.ProductForm;
import mad.memcam.converters.ProductToProductForm;
import mad.memcam.domain.Product;
import mad.memcam.entity.Login;
import mad.memcam.services.LoginService;
import mad.memcam.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping({"/login/"})
    public ResponseEntity<List<Login>> listLogins(Model model){
        //model.addAttribute("products", loginService.listAll());
        List<Login> list = loginService.listAll();
        if(list == null){
            list = new ArrayList<>();
        }
        return new ResponseEntity<List<Login>>(list, HttpStatus.OK);
    }

    @RequestMapping({"/login/{username}/{password}"})
    public ResponseEntity<Login> updateLogins(@PathVariable String username, @PathVariable String password, Model model){
        //model.addAttribute("products", loginService.listAll());
        Login login = new Login();
        login.setUserName(username);
        login.setPassWord(password);
        Login logins = loginService.saveOrUpdate(login);
        if(logins == null)
            return new ResponseEntity<Login>(new Login(), HttpStatus.OK);
        else
            return new ResponseEntity<Login>(logins, HttpStatus.OK);
    }

}
