/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.qr;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author avbravo
 */
public class QRCodeReader3 {
    private static String decodeQRCode(File qrCodeimage) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(qrCodeimage);
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        try {
            Result result = new MultiFormatReader().decode(bitmap);
            return result.getText();
        } catch (NotFoundException e) {
            System.out.println("There is no QR code in the image");
            return null;
        }
    }
    public static void main(String[] args) {
        try {
//            File file = new File("MyQRCode.png");
           
            
            InputStream barCodeInputStream = new FileInputStream("/home/avbravo/Descargas/a.png");
                BufferedImage barCodeBufferedImage = ImageIO.read(barCodeInputStream);

                LuminanceSource source = new BufferedImageLuminanceSource(barCodeBufferedImage);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                MultiFormatReader reader = new MultiFormatReader();
                com.google.zxing.Result result = reader.decode(bitmap);

                System.out.println("Barcode text is " + result.getText());
//                textField.setText(""+result.getText());
            System.out.println("texto: "+result.getText());
            
//            String decodedText = decodeQRCode(file);
//            if(decodedText == null) {
//                System.out.println("No QR Code found in the image");
//            } else {
//                System.out.println("Decoded text = " + decodedText);
//            }
        } catch (Exception e) {
            System.out.println("Could not decode QR Code, IOException :: " + e.getMessage());
        }
    }
}
