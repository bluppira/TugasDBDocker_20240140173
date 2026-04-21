package service;

import model.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final repository.UserRepository userRepository;

    public UserService(repository.UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User request){
        request.setId(UUID.randomUUID().toString());
        return userRepository.save(request);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUserById(String id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(String id, User request){
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null){
            existingUser.setName(request.getName());
            existingUser.setNim(request.getNim());
            return userRepository.save(existingUser);
        }
        return null;
    }

    public  void  deleteUser(String id){
        userRepository.deleteById(id);
    }
}
