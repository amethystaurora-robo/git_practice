package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

public class MethodTraining {
    public static void main(String[] args) {
        LargestNum largestNum = new LargestNum();
        CountConsonants countConsonants = new CountConsonants();
        AsciiArt asciiArt = new AsciiArt();
        IsNumberPrime isNumberPrime = new IsNumberPrime();
        HighLowArray highLowArray = new HighLowArray();

        largestNum.setlargestNum(3, 30, 300, 500);
        int a = largestNum.getlargestNum();
        System.out.println(a);

        int b = countConsonants.countConsonants("My sister is lame");
        System.out.println(b);

        asciiArt.drawArt();

        boolean isNumPrime = isNumberPrime.isNumberPrime(3);
        System.out.println(isNumPrime);

        highLowArray.getHighLowArray(new int[]{5, 7, 30});



    }
}


class LargestNum {
    private int a;
    private int b;
    private int c;
    private int d;

    public int getlargestNum() {

        if (this.a > this.b && this.a > this.c && this.a > this.d) {
            return this.a;
        } else if (this.b > this.a && this.b > this.c && this.b > this.d) {
            return this.b;
        } else if (this.c > this.a && this.c > this.b && this.c > this.d) {
            return this.c;
        } else {
            return this.d;
        }
    }

    public void setlargestNum(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}

class CountConsonants {
    private String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q",
            "r", "s", "t", "v", "w", "x", "y", "z"};

    private String a;
    private int count = 0;

    public int countConsonants(String a) {

        char[] aArray = a.toCharArray();
        for (int i = 0; i < aArray.length; i++) {
            for (int j = 0; j < consonants.length; j++) {
                if (consonants[j].equalsIgnoreCase(String.valueOf(aArray[i]))) {
                    count++;
                }
            }
        }
        return count;
    }

}

class AsciiArt {
    private char eyes = '.';
    private char downFrown = '|';
    private char frown = '_';

    public void drawArt() {

        System.out.println(eyes + "" + eyes + "" + eyes + "   " + eyes + "" + eyes + "" + eyes);
        System.out.println(" " + eyes + "     " + eyes);
        System.out.println(eyes + "" + eyes + "" + eyes + "   " + eyes + "" + eyes + "" + eyes);
        System.out.println();
        System.out.println(frown + "" + frown + "" + frown + "" + frown + "" + frown + "" + frown + "" + frown + "" + frown);
        System.out.println(downFrown + "      " + downFrown);
    }

}

class IsNumberPrime {
    private int userNum;
    private boolean isItPrime;

    public boolean isNumberPrime(int userNum) {
        for (int i = 2; i < userNum; i++) {
            if (userNum % i == 0) {
                isItPrime = false;
            } else {
                isItPrime = true;
            }
        }

        return isItPrime;
    }
}

class HighLowArray {
    private int[] userArray;

    public void getHighLowArray(int[] userArray) {
        int lowNum = 0;
        int highNum = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (highNum < userArray[i]) {
                highNum = userArray[i];
            }
            lowNum = userArray[0];
            if (lowNum > userArray[i]) {
                lowNum = userArray[i];
            }
        }
        int[] highLowArray = {lowNum, highNum};
        for(int i = 0; i < highLowArray.length; i++) {
            System.out.println(highLowArray[i]);
        }

    }
}

