package dz.univebechar.mad.controller;

import dz.univebechar.mad.entity.User;
import dz.univebechar.mad.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping()
    List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    User getUserbyId(@PathVariable("id") Long id){
        var optional = userRepository.findById(id);
        return optional.orElse(null);
    }
    @PostMapping
    User creatuser(@RequestBody User user) {
        return userRepository.save(user);
    }
    @PutMapping
    User updateuser(@RequestBody User user) {
        var optional= userRepository.findById(user.getId());
        if(optional.isPresent())
            return userRepository.save(user);
        return null;
    }
    @DeleteMapping
    void deletuseer(@RequestBody User user) {
        var optional= userRepository.findById(user.getId());
        if(optional.isPresent())
            userRepository.delete(user);
    }

}
