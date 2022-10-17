package sia.tacocloud.data;


public interface UserRepository extends CrudRepository<User, Long>{

    User findByUsername(String username);
}
