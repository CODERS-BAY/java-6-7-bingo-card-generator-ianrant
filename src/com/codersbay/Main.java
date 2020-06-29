package com.codersbay;

public class Main {

    public static int[] ALL_BINGO_NUMBERS = new int[25];

    public static boolean zeroLeftInArray() {
        for (int i = 0; i < ALL_BINGO_NUMBERS.length; i++) {
            if (ALL_BINGO_NUMBERS[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean newNumberIsUnique(int numberToTest) {
        for (int i = 0; i < ALL_BINGO_NUMBERS.length; i++) {
            if (ALL_BINGO_NUMBERS[i] == numberToTest) {
                return false;
            }
        }
        return true;

    }

    public static void addNumber(int placeAtIndex, Integer numberToAdd) {
        ALL_BINGO_NUMBERS[placeAtIndex] = numberToAdd;
    }

    public static int createRandom() {
        return (int) (Math.round(Math.random() * 75)) + 1;
    }

    public static void main(String[] args) {

        int clusterOneStart = 0;
        int clusterTwoStart = 5;
        int clusterThreeStart = 10;
        int clusterFourStart = 15;
        int clusterFiveStart = 20;

        while (zeroLeftInArray()) {
            Integer randomNumber = createRandom();
            if (newNumberIsUnique(randomNumber)) {
                if (randomNumber <= 15 && randomNumber > 0 && clusterOneStart < 5) {
                    addNumber(clusterOneStart, randomNumber);
                    clusterOneStart++;

                } else if (randomNumber <= 30 && randomNumber > 15 && clusterTwoStart < 10) {
                    addNumber(clusterTwoStart, randomNumber);
                    clusterTwoStart++;

                } else if (randomNumber <= 45 && randomNumber > 30 && clusterThreeStart < 15) {
                    addNumber(clusterThreeStart, randomNumber);
                    clusterThreeStart++;

                } else if (randomNumber <= 60 && randomNumber > 45 && clusterFourStart < 20) {
                    addNumber(clusterFourStart, randomNumber);
                    clusterFourStart++;

                } else if (randomNumber <= 75 && randomNumber > 60 && clusterFiveStart < 25) {
                    addNumber(clusterFiveStart, randomNumber);
                    clusterFiveStart++;
                }
            }
        }

        //System.out.println(Arrays.toString(ALL_BINGO_NUMBERS));


        String output = "B   I   N   G   O\n";
        output += "-----------------\n";
        output += ALL_BINGO_NUMBERS[0] + "  ";
        output += ALL_BINGO_NUMBERS[5] + "  ";
        output += ALL_BINGO_NUMBERS[10] + "  ";
        output += ALL_BINGO_NUMBERS[15] + "  ";
        output += ALL_BINGO_NUMBERS[20] + "  ";
        output += "\n";
        output += ALL_BINGO_NUMBERS[1] + "  ";
        output += ALL_BINGO_NUMBERS[6] + "  ";
        output += ALL_BINGO_NUMBERS[11] + "  ";
        output += ALL_BINGO_NUMBERS[16] + "  ";
        output += ALL_BINGO_NUMBERS[21] + "  ";
        output += "\n";
        output += ALL_BINGO_NUMBERS[2] + "  ";
        output += ALL_BINGO_NUMBERS[7] + "  ";
        output += "B  ";
        output += ALL_BINGO_NUMBERS[17] + "  ";
        output += ALL_BINGO_NUMBERS[22] + "  ";
        output += "\n";
        output += ALL_BINGO_NUMBERS[3] + "  ";
        output += ALL_BINGO_NUMBERS[8] + "  ";
        output += ALL_BINGO_NUMBERS[13] + "  ";
        output += ALL_BINGO_NUMBERS[18] + "  ";
        output += ALL_BINGO_NUMBERS[23] + "  ";
        output += "\n";
        output += ALL_BINGO_NUMBERS[4] + "  ";
        output += ALL_BINGO_NUMBERS[9] + "  ";
        output += ALL_BINGO_NUMBERS[14] + "  ";
        output += ALL_BINGO_NUMBERS[19] + "  ";
        output += ALL_BINGO_NUMBERS[24] + "  ";

        System.out.println(output);


    }
}
