package Service;

import Dto.UserDto;
import org.springframework.stereotype.Service;

@Service

public interface UserService {


    String addUser(UserDto userDto);
}
