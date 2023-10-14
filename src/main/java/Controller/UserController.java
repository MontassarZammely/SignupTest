package Controller;

import Dto.UserDto;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String SaveUser(@RequestBody UserDto userDto)
    {
        String id = userService.addUser(userDto);
        return id;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
