import java.util.Scanner;
public class LeerScanner
{
     public static String LeerString(String leer){
    Scanner entrada=new Scanner(System.in);
    System.out.println(leer);
    return entrada.nextLine();
    }  
    
    
    //LEER TIPO DE DATO INT
    public static int leerEntero(){
        String cadena="Digite un numero entero";
        int Entero=0;
        while(true){
            try{
            Entero=Integer.parseInt(LeerString(cadena));
            return Entero;
        }catch(NumberFormatException miExcepcion){
            cadena="Entrada invalida,volver a intentar";
        }
    }
}

 //LEER TIPO DE DATO BYTE
    public static byte leerByte(){
        String cadena="Digite dato de tipo Byte";
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
    
    public static short leerShort(){
        String cadena="Digite dato de tipo Short";
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
    public static long leerLong(){
        String cadena="Digite dato de tipo Long";
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
    public static float leerFloat(){
        String cadena="Digite dato de tipo Float";
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
    public static double leerDouble(){
        String cadena="Digite dato de tipo Double";
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
   public static char leerChar(){
        String cadena="Digita dato del tipo Char";
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
public static String leerCadenadeTexto(){
        String cad="Ingrese texto sin numeros";
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
    
    public static String leernumerosyletras(){
        String text="Ingresa un texto de letras y numeros";
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
    

