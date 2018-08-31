/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.qr;

import com.avbravo.avbravoutils.QR;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author avbravo
 */
public class QRCodeReader {
   
    public static void main(String[] args) {
        try {

           String imagenPath="/home/avbravo/Descargas/b.png";
            String decodedText = QR.decodificarQRCode(imagenPath, false);
            if(decodedText == null) {
                System.out.println("No QR Code found in the image");
            } else {
                System.out.println("Decoded text = " + decodedText);
            }
        } catch (Exception e) {
            System.out.println("Could not decode QR Code, IOException :: " + e.getMessage());
        }
    }
}
