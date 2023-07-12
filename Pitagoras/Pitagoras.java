public class Pitagoras {
    //metodo para calcular la hipotenusa 
    public double calcularHipotenusa(double catetoA, double catetoB){
        double resultado = 0.0;
        resultado = Math.sqrt(catetoA*catetoA + catetoB*catetoB);
        return resultado;
    }
    
}
