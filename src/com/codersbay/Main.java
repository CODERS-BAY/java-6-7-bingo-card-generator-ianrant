package com.codersbay;

public class Main {

    public static int[] ALL_BINGO_NUMBERS = new int[25];

    public static boolean zeroIndexExists() {
        boolean zeroExists = true;
        for (int i : ALL_BINGO_NUMBERS) {
            if (ALL_BINGO_NUMBERS[i] == 0) {
                zeroExists = true;
            } else {
                zeroExists = false;
            }
            break;
        }
        return zeroExists;
    }

    public static boolean newNumberIsUnique(int numberToTest) {
        boolean numberAllowed = false;
        for (int i : ALL_BINGO_NUMBERS) {
            if (ALL_BINGO_NUMBERS[i] != numberToTest && numberToTest != 0) {
                numberAllowed = true;
            } else {
                numberAllowed = false;
            }
            break;
        }
        return numberAllowed;
    }

    public static void addNumber(int placeInArray, int numberToAdd) {
        ALL_BINGO_NUMBERS[placeInArray - 1] = numberToAdd;
    }

    public static int createRandom() {
        return (int) (Math.round(Math.random() * 75)) + 1;
    }

    public static void main(String[] args) {
        int rowOneStart = 1;
        int rowTwoStart = 6;
        int rowThreeStart = 11;
        int rowFourStart = 16;
        int rowFiveStart = 21;

        while (zeroIndexExists()) {

            Integer randomNumber = createRandom();

            //System.out.print(randomNumber);

            if (randomNumber <= 15 && randomNumber != 0 && rowOneStart < 6) {
                if (newNumberIsUnique(randomNumber)) {
                    addNumber(rowOneStart, randomNumber);
                    rowOneStart++;
                } else {
                    break;
                }


            } else if (randomNumber <= 30 && randomNumber != 0 && rowTwoStart < 11) {
                if (newNumberIsUnique(randomNumber)) {
                    addNumber(rowTwoStart, randomNumber);
                    rowTwoStart++;
                } else {
                    break;
                }

            } else if (randomNumber <= 45 && randomNumber != 0 && rowThreeStart < 16) {
                if (newNumberIsUnique(randomNumber)) {
                    addNumber(rowThreeStart, randomNumber);
                    rowThreeStart++;
                } else {
                    break;
                }

            } else if (randomNumber <= 60 && randomNumber != 0 && rowFourStart < 21) {
                if (newNumberIsUnique(randomNumber)) {
                    addNumber(rowFourStart, randomNumber);
                    rowFourStart++;
                } else {
                    break;
                }

            } else if (randomNumber <= 75 && randomNumber != 0 && rowFiveStart <= 25) {
                if (newNumberIsUnique(randomNumber)) {
                    addNumber(rowFiveStart, randomNumber);
                    rowFiveStart++;
                } else {
                    break;
                }
            }
        }

        String output = "";
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
        output += "_  ";
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
