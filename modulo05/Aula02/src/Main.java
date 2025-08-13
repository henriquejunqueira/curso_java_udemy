public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase(); // converte a string para minúsculo
        String s02 = original.toUpperCase(); // converte a string para maiúsculo
        String s03 = original.trim(); // elimina espaços desnecessários
        String s04 = original.substring(2); // pega a posição inicial de um caracter em uma string
        String s05 = original.substring(2, 9); // // pega a posição inicial e final de um caracter em uma string
        String s06 = original.replace('a', 'x'); // substitui o caracter especificado por outro
        String s07 = original.replace("abc", "xy"); // substitui a substring especificada por outra
        int i = original.indexOf("bc"); // pega a primeira ocorrência de um caracter na string
        int j = original.lastIndexOf("bc"); // pega a última ocorrência de um caracter na string

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase (minúsculas): -" + s01 + "-");
        System.out.println("toUpperCase (maiúsculas): -" + s02 + "-");
        System.out.println("trim (elimina espaços desnecessários): -" + s03 + "-");
        System.out.println("substring(2) (inicia no caracter da posição definida): -" + s04 + "-");
        System.out.println("substring(2, 9) (inicia no caracter da posição definida e finaliza na posição especificada): -" + s05 + "-");
        System.out.println("replace('a', 'x') (troca o caracter especificado por outro): -" + s06 + "-");
        System.out.println("replace('abc', 'xy') (troca a substring especificada por outra): -" + s07 + "-");
        System.out.println("Index of 'bc' (pega a primeira ocorrência de um caracter na string): " + i);
        System.out.println("Last index of 'bc' (pega a última ocorrência de um caracter na string): " + j);

        String s = "potato apple lemon orange";

        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

    }
}