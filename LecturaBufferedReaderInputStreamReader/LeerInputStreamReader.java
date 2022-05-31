
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;

public class LeerInputStreamReader
{
     public static String LeerString(String leer)throws IOException{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
        
    System.out.println(leer);
    return br.readLine();
}
//LEER TIPO DE DATO INT
    public static int leerEntero()throws IOException{
        String cadena="Digite un numero entero";
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int Entero=0;
        while(true){
            try{
            Entero=Integer.parseInt(LeerString(cadena));
        }catch(NumberFormatException miExcepcion){
            cadena="Entrada invalida,volver a intentar";
        }
    }
}

 //LEER TIPO DE DATO BYTE
    public static byte leerByte()throws IOException{
        String cadena="Digite dato de tipo Byte";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        byte B=0;
        while(true){
            try{
            B=Byte.parseByte(LeerString(cadena));
            return B;
        }catch(NumberFormatException miExcepcion){
            cadena="Entrada invalida,volver a intentar";
        }
    }
}

    //LEER TIPO DE DATO SHORT
    
    public static short leerShort()throws IOException{
        String cadena="Digite dato de tipo Short";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        short corto=0;
        while(true){
            try{
            corto=Short.parseShort(LeerString(cadena));
            return corto;
        }catch(NumberFormatException miExcepcion){
            cadena="Entrada invalida,volver a intentar";
        }
    }
}

    //LEER TIPO DE DATO LONG
    public static long leerLong()throws IOException{
        String cadena="Digite dato de tipo Long";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long Largo=0;
        while(true){
            try{
            Largo=Long.parseLong(LeerString(cadena));
            return Largo;
        }catch(NumberFormatException miExcepcion){
            cadena="Entrada invalida,volver a intentar";
        }
    }
}

    //LEER TIPO DE DATO FLOAT
    public static float leerFloat()throws IOException{
        String cadena="Digite dato de tipo Float";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        float Flotante=0.0f;
        while(true){
            try{
            Flotante=Float.parseFloat(LeerString(cadena));
            return Flotante;
        }catch(NumberFormatException miExcepcion){
            cadena="Entrada invalida,volver a intentar";
        }
    }
}

    //LEER TIPO DE DATO DOUBLE
    public static double leerDouble()throws IOException{
        String cadena="Digite dato de tipo Double";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        double d=0.0;
        while(true){
            try{
            d=Double.parseDouble(LeerString(cadena));
            return d;
        }catch(NumberFormatException miExcepcion){
            cadena="Entrada invalida,volver a intentar";
        }
    }
}

    //LEER TIPO DE DATO CHAR
   public static char leerChar()throws IOException{
        String cadena="Digita dato del tipo Char";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        char caracter='.';
        while(true){
            try{
           String p=LeerString(cadena);
            if(p.length()!=1){
                throw new Exception();
            }else
            caracter=p.charAt(0);
            return caracter;
        }catch(Exception miExcepcion){
            cadena="Entrada invalida, volver a intentar";
        }
    }
}
    //LEER ENTRADA DE LETRAS
public static String leerCadenadeTexto()throws IOException{
        String cad="Ingrese texto sin numeros";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String cadena="";
        char l='.';
        while(true){
            try{
            cadena=LeerString(cad);
            for(int x=0;x<cadena.length();x++){
                l=cadena.charAt(x);
                if(!Character.isLetter(l)){
                    throw new Exception ();
                }
            }
            return cadena;
        }catch(Exception miExcepcion){
            cad="Entrada invalida, volver a intentar";
        }
    }
}
    

    //LEER ENTRADA DE LETRAS Y NUMEROS
    
    public static String leernumerosyletras()throws IOException{
        String text="Ingresa un texto de letras y numeros";
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String cadena=" ";
        char l='.';
        while(true){
            try{
            cadena=LeerString(text);
            for(int x=0;x<cadena.length();x++){
                l=cadena.charAt(x);
                if(!Character.isLetterOrDigit(l)){
                    throw new Exception ();
                }
            }
            return cadena;
        }catch(Exception miExcepcion){
            text="Entrada invalida, volver a intentar";
        }
    }
}
    
}



