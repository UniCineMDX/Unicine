package co.edu.uniquindio.unicine.repo;

import co.edu.uniquindio.unicine.entidades.CuponCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuponClienteRepo extends JpaRepository<CuponCliente, Integer>{

    //alreves
    @Query("select cup from Cliente cli join cli.cupones cup where cli.correo = :correo")
    List<CuponCliente>obtenerCupones (String correo);
}