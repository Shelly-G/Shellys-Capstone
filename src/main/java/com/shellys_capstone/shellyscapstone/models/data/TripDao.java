
package com.shellys_capstone.shellyscapstone.models.data;

        import com.shellys_capstone.shellyscapstone.models.forms.Expense;
        import com.shellys_capstone.shellyscapstone.models.forms.Trip;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import javax.transaction.Transactional;


@Repository
@Transactional
public interface TripDao extends CrudRepository<Trip, Integer> {
}

