package com.learn.coding.string;

public class CharArrayToStringMain {
    public static void main(String[] args) {

        char [] data = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String dataChar = new String(data);
        System.out.println(dataChar);

        char [] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String msg = String.valueOf(alpha);
        System.out.println(msg);

        char [] beta = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String betaData = String.copyValueOf(beta);
        System.out.println(betaData);

        char [] gamma = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String gammaData = String.copyValueOf(gamma);
        System.out.println(gammaData);

        char [] zeta = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String zetaData = String.copyValueOf(zeta, 2, 5);
        System.out.println(zetaData);

    }
}
