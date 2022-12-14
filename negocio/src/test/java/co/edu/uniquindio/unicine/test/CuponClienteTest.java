package co.edu.uniquindio.unicine.test;

import co.edu.uniquindio.unicine.entidades.Compra;
import co.edu.uniquindio.unicine.entidades.CuponCliente;
import co.edu.uniquindio.unicine.entidades.EstadoCupon;
import co.edu.uniquindio.unicine.repo.CuponClienteRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CuponClienteTest {

    @Autowired
    private CuponClienteRepo cuponClienteRepo;



    @Test
    @Sql("classpath:dataset.sql")
    public void registrar(){

        List<CuponCliente> cupones = cuponClienteRepo.obtenerCuponesNoUsados("123", EstadoCupon.SIN_USAR);

        cupones.forEach(System.out::println);
    }


}
