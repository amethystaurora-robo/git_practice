package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class MethodTraining {
    public static void main(String[] args) {
        LargestNum largestNum = new LargestNum();
        CountConsonants countConsonants = new CountConsonants();
        AsciiArt asciiArt = new AsciiArt();
        IsNumberPrime isNumberPrime = new IsNumberPrime();
        HighLowArray highLowArray = new HighLowArray();
        ReverseArray reverseArray = new ReverseArray();
        DivisorList divisorList = new DivisorList();

        largestNum.setlargestNum(3, 30, 300, 500);
        int a = largestNum.getlargestNum();
        System.out.println(a);

        int b = countConsonants.countConsonants("My sister is lame");
        System.out.println(b);

        asciiArt.drawArt();

        boolean isNumPrime = isNumberPrime.isNumberPrime(3);
        System.out.println(isNumPrime);

        highLowArray.getHighLowArray(new int[]{5, 7, 30});

        reverseArray.setReverseArray();

        int i = divisorList.DivisorList(50, 16, 32);

        System.out.println(i);




    }
}


class LargestNum {
    //pass by values, each value is changed below without affecting the original variables
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

class ReverseArray {
    List<String> reverseArray = new ArrayList(Arrays.asList("hi", "my", "name", "is", "Monday"));
    String holdNum;

    public void setReverseArray() {
        for(int i = 0; i < reverseArray.size(); i++) {
            holdNum = String.valueOf(reverseArray.get(i));
            reverseArray.remove(i);
            reverseArray.add(0, holdNum);

        }
        for(int i = 0; i < reverseArray.size(); i++) {
            System.out.println(reverseArray.get(i));
        }
    }
}

class DivisorList {
    private int maxNum;
    private int divisor1;
    private int divisor2;

    //pass by reference. The list is modified from its original version in the method below
    public List<Integer> divisorList = new ArrayList();

    public int DivisorList(int maxNum, int divisor1, int divisor2) {
        int count = 1;
        while(count < maxNum) {
            if(divisor1 % count == 0 && divisor2 % count == 0) {
                divisorList.add(count);
            }
            count++;
        }

        return divisorList.size();
    }

    //method overloading
    public int DivisorList(int maxNum, int divisor1, int divisor2, int divisor3) {
        int count = 1;
        while(count < maxNum) {
            if(divisor1 % count == 0 && divisor2 % count == 0 && divisor3 % count ==0) {
                divisorList.add(count);
            }
            count++;
        }

        return divisorList.size();
    }
}

