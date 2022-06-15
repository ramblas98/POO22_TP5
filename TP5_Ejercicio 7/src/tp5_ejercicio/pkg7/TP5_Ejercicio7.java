
package tp5_ejercicio.pkg7;

import java.lang.Exception;

public class TP5_Ejercicio7 {

    public static void escribir (FileWriter fw, String linea){
	fw.write(line);
    }
    public static void leer(FileReader fr){
	int v = fr.read();
	while(v != -1){
		System.out.print((char)v);
		v = fr.read();
	}
	fr.close();
    }
    public static void copiar(FileReader fIn, FileWriter fOut){
	int v = fIn.read();
	while (v != -1){
		fOut.append((char)v);
		v = fIn.read();
	}
	fIn.close();
	fOut.close;
    }
    
    public static void main(String[] args) {
    FileReader fEn;
    FileWriter fSal;

    String ruta = "C:\Users\Matias\Documents\POO";
    String archivo = "datos.txt";

    fSal = new FileWriter(ruta + archivo);
    fSal.write("Linea 1: Probando archivo de texto."+"\n");
    fSal.write("Linea 2: Escribiendo en archivo de texto."+"\n");
    fSal.close();

    System.out.println("____Lectura del archivo___")
    fEn = new FileReader(ruta + archivo);
    leer(fEn);

    FileWriter fBk;
    fEn = new FileReader(ruta + archivo);
    fBk = new FileWriter(ruta + "BK" + archivo);
    copiar(fEn, fBk);

    System.out.println("______Lectura del archivo de Back Up_______");
    FileReader fBk1 = new FileReader(ruta + "BK" + archivo);
    leer(fBk1);
        
    }
    
}
