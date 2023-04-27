public class OperacaoLogicoNegacao {
    public static void main (String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        System.out.println(!a);
        System.out.println(!(b || c));
    }
}