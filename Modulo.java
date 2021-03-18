import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Modulo {
    
    public static void main(String[] args) {
        
        Token tk = new Token("ArchivoLisp.txt");
        //System.out.println(tk.mostrarToken());
        tk.convertirToken();

    }

}
class Token{

    private String   rawOp;
    private String[] vectorSintetico;

    protected Token(String nArchivo){
        rawOp = "";
        try {
            File archivoTexto = new File(nArchivo);
            Scanner scanner = new Scanner(archivoTexto);
            while (scanner.hasNextLine()) {
                this.rawOp += scanner.nextLine();
            }
            scanner.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Hubo un error, no se encotro el archivo.");
            e.printStackTrace();
        }
    }
    protected boolean convertirToken(){
        try {



















            ArrayList<String> divisiones = new ArrayList<>();

            // for(int pos = 0; pos < this.rawOp.length(); pos++){
            //     if(Character.toString(this.rawOp.charAt(pos)).equals("(")){
            //         String prntAcumulado = "";
            //         for(int cierre = pos; cierre < this.rawOp.length(); cierre++){
            //             if(Character.toString(this.rawOp.charAt(cierre)).equals(")")){
            //                 prntAcumulado += ")";
            //                 break;
            //             }
            //             else{
            //                 prntAcumulado += Character.toString(this.rawOp.charAt(cierre));
            //             }
            //         }
            //         divisiones.add(prntAcumulado);
            //     }
            // }
                
            
            for(int i = 0; i < this.rawOp.length(); i++){

                if(Character.toString(this.rawOp.charAt(i)).equals("(")){

                    String tempparth = "";

                    for(int j = i; j < this.rawOp.length(); j++){

                        if(Character.toString(this.rawOp.charAt(j)).equals("(")){


                            for(int k = j; k < this.rawOp.length(); k++){
                            
                                
                            
                            }

                        }

                        if(Character.toString(this.rawOp.charAt(j)).equals(")")){

                            tempparth += ")";
                            break;

                        }

                        else{

                            tempparth += Character.toString(this.rawOp.charAt(j));

                        }


                    }

                    divisiones.add(tempparth);



                }


            }
























            
            divisiones.forEach(System.out::println);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    protected String mostrarToken(){
        return this.rawOp;
    } 

}

class Parse{



}
class Interpretar{



}