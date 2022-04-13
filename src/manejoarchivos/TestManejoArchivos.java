/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author adseglocdom
 */
public class TestManejoArchivos {
    
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, "Hola mundo");
        //anexarArchivo(nombreArchivo, "adios");
        leerArchivo(nombreArchivo);
    }
    
}
