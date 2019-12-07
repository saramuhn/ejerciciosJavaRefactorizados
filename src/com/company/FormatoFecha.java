package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatoFecha {
    public void cambiarFormatoFecha(){
        Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
        String fechaCambiada = formatoFecha.format(fecha);
        System.out.println("Fecha: "+ fechaCambiada);
    }

}
