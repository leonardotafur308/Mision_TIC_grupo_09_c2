package utp.misiontic2022.c2.reto4.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.reto4.model.dao.RequerimientoDao_1;
import utp.misiontic2022.c2.reto4.model.dao.RequerimientoDao_2;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.reto4.model.vo.Requerimiento_2;

public class ControllerRequerimientos {
    private final RequerimientoDao_1 requerimientoDao_1 = new RequerimientoDao_1();
    private final RequerimientoDao_2 requerimientoDao_2 = new RequerimientoDao_2();

    public ArrayList<Requerimiento_1> consultaRequerimiento_1() throws SQLException {
        return this.requerimientoDao_1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultaRequerimiento_2() throws SQLException {
        return this.requerimientoDao_2.requerimiento2();
    }
    
}
