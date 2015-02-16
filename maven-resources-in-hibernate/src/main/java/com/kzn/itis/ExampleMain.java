package com.kzn.itis;

import com.kzn.itis.db.model.User;
import com.kzn.itis.db.repositories.UserRepository;
import com.kzn.itis.db.repositories.impl.UserRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;

/**
 *
 */
public class ExampleMain {

    private static final Logger logger = LoggerFactory.getLogger(ExampleMain.class);


    public static void main(String... args) throws SQLException {
        logger.info("Welcome to Example Application");

        UserRepository userRepository = new UserRepositoryImpl();

        User user = new User();
        user.setAge(25);
        user.setFirstname("James");
        user.setLastname("Bond");

        userRepository.addUser(user);

        logger.info("User has been added!");

        long count = userRepository.getCount();

        logger.info("New count: " + String.valueOf(count));

    }
}
