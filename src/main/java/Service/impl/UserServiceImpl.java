package Service.impl;

import Dto.UserDto;
import Entity.User;
import Repo.UserRepo;
import Service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getEmail(),
                this.passwordEncoder.encode(userDto.getPassword())
        );
        userRepo.save(user);


        return user.getName();
    }
}
