package com.myorganization.pos_system.repository;

import com.myorganization.pos_system.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository//Exception handling + create a bean (also implemented jpa repo create the bean)
@EnableJpaRepositories
public interface CUSTOMER_REPO extends JpaRepository<Customer,Integer> {//repo note that id is an Integer

}


//public class CustomerRepository {
//    public void saveCustomer(Customer customer) {
//        try {
//            jdbcTemplate.update("INSERT INTO customers ...", customer.getId(), customer.getName());
//        } catch (SQLException e) {
//            // Handle SQLException
//            e.printStackTrace();
//        }
//    }
//}
//-------------------------------------------------------------------------------

//@Repository
//public class CustomerRepository {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public void saveCustomer(Customer customer) {
//        jdbcTemplate.update("INSERT INTO customers ...", customer.getId(), customer.getName());
//        // No need to explicitly handle SQLException
//    }
//}


