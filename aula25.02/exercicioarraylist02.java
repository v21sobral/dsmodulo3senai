class ExercicioArrayList02 {
    public static void main(String[] args) {
        // Crie um ArrayList de Strings e adicione 5 nomes a ele. Em seguida, imprima os nomes usando um loop for.
        int [] numeros = {10, 20, 30, 40, 50};

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Posição "+i+" = "+numeros[i]);
        }

            for(int numero : numeros) {
                System.out.println(numero);
    
            }
        }
    }
