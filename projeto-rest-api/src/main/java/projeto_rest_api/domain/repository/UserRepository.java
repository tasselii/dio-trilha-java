package projeto_rest_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto_rest_api.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
