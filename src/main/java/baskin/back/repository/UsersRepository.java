package baskin.back.repository;


import baskin.back.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

import javax.transaction.Transactional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    public List<Users> findAll();

    @Query(value = "SELECT * FROM users WHERE userid = :userid", nativeQuery = true)
    public Users existUser(@Param("userid")String userid);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM users WHERE userid = :userid", nativeQuery = true)
    public void deleteUser(@Param("userid")String userid);


    @Query(value = "SELECT * FROM users WHERE userid = :userid AND userpw = :userpw", nativeQuery = true)
    public Users login(@Param("userid")String userid, @Param("userpw")String userpw);

}
