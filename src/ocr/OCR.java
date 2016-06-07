/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ocr;

import com.aspose.ocr.*;

/**
 *
 * @author pragnesh
 */
public class OCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(OCR.class);

        /// Set the paths
        String imagePath = dataDir + "Sampleocr.bmp";

        // Create an instance of OcrEngine
        OcrEngine ocr = new OcrEngine();

        // Set image file
        ocr.setImage(ImageStream.fromFile("D:\\error1.bmp"));

        // Perform OCR and get extracted text
        try {
            if (ocr.process()) {
                System.out.println("\ranswer -> " + ocr.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
