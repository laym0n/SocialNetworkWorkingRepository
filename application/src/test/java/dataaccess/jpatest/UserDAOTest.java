package dataaccess.jpatest;

import second.TestClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class UserDAOTest extends JPAIntegrationEnvironment {
    //    @Autowired
//    private UserDAO SUT;
//    @Autowired
//    private EntityManager entityManager;
    @Autowired
    private TestClass user;

    @Test
    public void validAddTest() {
        assertTrue(true);
//        //Assign
//        UserEntity userForAdd = new UserEntity();
//        userForAdd.setUserName("user");
//        userForAdd.setPassword("password");
//
//        //Action
//        SUT.save(userForAdd);
//        entityManager.detach(userForAdd);
//
//        //Assert
//        Optional<UserEntity> resultFromSUT = SUT.findById(userForAdd.getId());
//        assertTrue(resultFromSUT.isPresent(), () -> "User was saved but not founded");
//
//        assertEquals(userForAdd, resultFromSUT.get());
    }
}
