package campProject.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
//	User findByEmail(String eMail);
}
