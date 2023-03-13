
package com.portfoliolmc.lucas.Security.Repository;

import com.portfoliolmc.lucas.Security.Entity.Rol;
import com.portfoliolmc.lucas.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
