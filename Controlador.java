import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador{

    private Interprete   interpretador;
    private String operacionAlmacenada;

    public static void main(String[] args) {
        
        // Inicio del Interprete
        Controlador ctrl = new Controlador();
        
        // Ejecutar los metodos, leer, interpretar, mostrar. Estos metodos son 
        // encargados de manejar la operacion que el usuario ingrese:
        
        //ctrl.recibirInstrucciones();
        System.out.println("Operacion leida: \n\n" + ctrl.operacionAlmacenada + "\n");

        /** (setqa5)(setqb1)(setqc1)(dotimes(na)(setqc(*bc))(setqb(1+n)))(print"Resultado:")(print(*bc)) */

        

        ctrl.interpretarInstrucciones();
        //ctrl.mostrarResultado();

    }

    //LISTO
    public Controlador(){

        interpretador = new Interprete();
        operacionAlmacenada = "";

    }

    // // LISTO
    // public void recibirInstrucciones(){
    //     try {
    //         File archivoTexto = new File("ArchivoLisp.txt");
    //         Scanner scanner = new Scanner(archivoTexto);
    //         while (scanner.hasNextLine()) {
    //             this.operacionAlmacenada += scanner.nextLine();
    //         }
    //         scanner.close();
    //     } 
    //     catch (FileNotFoundException e) {
    //         System.out.println("Hubo un error, no se encotro el archivo.");
    //         e.printStackTrace();
    //     }   
    // }
   
    // EN PROCESO
    public void interpretarInstrucciones(){

        // ArrayList<String> parseParentesis = new ArrayList<>();
        /** (setqa5)(setqb1)(setqc1)(dotimes(na)(setqc(*bc))(setqb(1+n)))(print"Resultado:")(print(*bc)) */
        // for(int pos = 0; pos < this.operacionAlmacenada.length(); pos++){
        //     if(Character.toString(this.operacionAlmacenada.charAt(pos)).equals("(")){
        //         String prntAcumulado = "";
        //         for(int cierre = pos; cierre < this.operacionAlmacenada.length(); cierre++){
        //             if(Character.toString(this.operacionAlmacenada.charAt(cierre)).equals(")")){
        //                 prntAcumulado += ")";
        //                 break;
        //             }
        //             else{
        //                 prntAcumulado += Character.toString(this.operacionAlmacenada.charAt(cierre));
        //             }
        //         }
        //         parseParentesis.add(prntAcumulado);
        //     }
        // }
        // parseParentesis.forEach(System.out::println);

    }

    // SIN COMENZAR
    public void mostrarResultado(){

    }

}