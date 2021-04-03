package com.muratcelik.controller;

/**
 * @author Murat Çelik
 */

import com.muratcelik.model.User;
import com.muratcelik.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... strings) throws Exception {

        User u1 = createUser("user::0001", "Murat", "Çelik", "murat.celik@pegam.com");
        userRepository.save(u1);

        User u2 = createUser("user::0002", "Yelda", "Yol", "yelda.yol@pegam.com");
        userRepository.save(u2);

        User u3 = createUser("user::0003", "Zerda", "Karadumanlıoğlu", "zerrin.karadumanlıoglu@pegam.com");
        userRepository.save(u3);
    }

    public static User createUser(String id, String firstName, String lastName,
                                  String email) {
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        return user;
    }

}
