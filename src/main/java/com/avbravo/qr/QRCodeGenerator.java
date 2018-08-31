/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.qr;


import com.avbravo.avbravoutils.QR;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author avbravo
 */
public class QRCodeGenerator {
//    private static final String QR_CODE_IMAGE_PATH = "./MyQRCode.png";
    private static final String QR_CODE_IMAGE_PATH = "/home/avbravo/Descargas/a.png";

 
    
     public static void main(String[] args) {
        try {
            QR.generarImagenQRCode("Aristides villlarreal bravo", 350, 350, QR_CODE_IMAGE_PATH);
       
        } catch (Exception e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
    }
}
