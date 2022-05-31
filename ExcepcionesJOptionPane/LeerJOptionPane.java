import javax.swing.JOptionPane;
public class LeerJOptionPane
{
    
    
   public static String leerString(String s){
        return JOptionPane.showInputDialog(s);
    }
   
    //LEER TIPO DE DATO INT
    public static int leerEntero(){
        String cadena="Digite un numero entero";
        int Entero=0;
        while(true){
            try{
            Entero=Integer.parseInt(leerString(cadena));
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
            B=Byte.parseByte(leerString(cadena));
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
            corto=Short.parseShort(leerString(cadena));
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
            Largo=Long.parseLong(leerString(cadena));
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
            Flotante=Float.parseFloat(leerString(cadena));
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
            d=Double.parseDouble(leerString(cadena));
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
           String p=leerString(cadena);
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
            cadena=leerString(cad);
            for(int i=0;i<cadena.length();i++){
                l=cadena.charAt(i);
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
    
    //WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW
    public static String leerCadenanumerosyletras(){
        String cad="Ingresa un texto de letras y numeros",cadena=" ";
        char letra='o';
        while(true){
            try{
            cadena=leerString(cad);
            for(int i=0;i<cadena.length();i++){
                letra=cadena.charAt(i);
                if(!Character.isLetterOrDigit(letra)){
                    throw new Exception ();
                }
            }
            return cadena;
        }catch(Exception miExcepcion){
            JOptionPane.showMessageDialog(null,"No seas tonto solo valores de este tipo de dato");
            cad="Formato invalido,ingresar valor correcto";
        }
    }
}

public static String leerCadenaletrasysimbolos(){
        String cad="Ingresa un texto de letras y simbolos",cadena="";
        char letra='a';
        while(true){
            try{
            cadena=leerString(cad);
            for(int i=0;i<cadena.length();i++){
                letra=cadena.charAt(i);
                if(Character.isDigit(letra)){
                    throw new Exception ();
                }
            }
            return cadena;
        }catch(Exception miExcepcion){
            JOptionPane.showMessageDialog(null,"No seas tonto solo valores de este tipo de dato");
            cad="Formato invalido,ingresar valor correcto";
        }
    }
}

}
