package examen1;

public class Palabras {
    private String cadena;

    public Palabras(String cadena) {
        this.cadena = cadena;
    }

    public Palabras() {
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void primeraMayuscula() {
        String firstLetterUpperCase = this.cadena.substring(0, 1).toUpperCase() + this.cadena.substring(1);
        System.out.println(firstLetterUpperCase);
    }

    public void invertirCadena() {
        String invertedCadena = new StringBuilder(this.cadena).reverse().toString();
        System.out.println(invertedCadena);
    }

    public void vocalesMayuscula() {
        String vocales = "aeiouAEIUO";
        StringBuilder cadenaModificada = new StringBuilder();

        for (char letra : this.cadena.toCharArray()) {
            if (vocales.indexOf(letra) != -1) {
                cadenaModificada.append(Character.toUpperCase(letra));
            } else {
                cadenaModificada.append(letra);
            }
        }

        this.cadena = cadenaModificada.toString();
        System.out.println(this.cadena);
    }

    public void palindromo() {
        String invertedCadena = new StringBuilder(this.cadena).reverse().toString();
        boolean isPalindrome = this.cadena.equals(invertedCadena);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}






