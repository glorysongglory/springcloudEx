package sodbvi.cloud.cloudboot.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sodbvi.cloud.cloudboot.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
