package projeto_rest_api.service;

import projeto_rest_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
