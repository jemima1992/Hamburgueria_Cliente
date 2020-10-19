
package utilitários;

public class verificadoresECorretores {
    
    public static String converteParaSQL(String Data){
        
        return Data.substring(6, 10)+ "-"+Data.substring(3, 5)+"-"+Data.substring(0, 2);
    }
    
    public static String converteParaJava(String Data){
        
        return Data.substring(8, 10)+ "/"+Data.substring(5, 7)+"/"+Data.substring(0, 4);
    }
}
