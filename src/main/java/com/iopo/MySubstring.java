package com.iopo;

public class MySubstring {


    public MySubstring() {
    }

    /**
     * This method takes 3 input parameters and returns new String object
     * containing the substring of the 1st parameter from specified startIndex
     * with the desired length specified as the 3rd parameter.
     */
    public String mySubstring(String parameter1, int startIndex, int readingLength) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = new String[parameter1.length()];

        try {
            //Starts reading from left to right.
            if (startIndex >= 0) {
                for (int i = 0; i <= stringArray.length; i++) {
                    if (i == (startIndex + 1)) {
                        stringBuilder.append(parameter1.charAt(i - 1));
                        for (int j = i; j < (startIndex + readingLength); j++) {
                            stringBuilder.append(parameter1.charAt(j));
                        }
                    }
                }
            } else {
                //Starts reading from right to left.
                for (int i = stringArray.length; i > 0; i--) {
                    if (i == (stringArray.length + startIndex) + 1) {
                        stringBuilder.append(parameter1.charAt(i - 1));
                        for (int j = i; j < ((stringArray.length + startIndex) + readingLength); j++) {
                            stringBuilder.append(parameter1.charAt(j));
                        }
                    }
                }
            }
            return stringBuilder.toString();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You specified an invalid range: " + e.getMessage());
            return null;
        }
    }

    /**
     * This method takes 3 input parameters and returns new Integer object
     * containing the substring of the 1st parameter from specified startIndex
     * with the desired length specified as the 3rd parameter.
     */
    public Integer mySubstring(Integer parameter1, Integer startIndex, Integer readingLength) {

        String convertedInt = Integer.toString(parameter1);
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = new String[convertedInt.length()];

        try {
            //Starts reading from left to right.
            if (startIndex >= 0) {
                for (int i = 0; i <= stringArray.length; i++) {
                    if (i == (startIndex + 1)) {
                        stringBuilder.append(convertedInt.charAt(i - 1));
                        for (int j = i; j < (startIndex + readingLength); j++) {
                            stringBuilder.append(convertedInt.charAt(j));
                        }
                    }
                }
            } else {
                //Starts reading from right to left.
                for (int i = stringArray.length; i > 0; i--) {
                    if (i == ((stringArray.length + startIndex) + 1)) {
                        stringBuilder.append(convertedInt.charAt(i - 1));
                        for (int j = i; j < ((stringArray.length + startIndex) + readingLength); j++) {
                            stringBuilder.append(convertedInt.charAt(j));
                        }
                    }
                }
            }
            Integer myResult = Integer.valueOf(stringBuilder.toString());
            return myResult;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You specified an invalid range: " + e.getMessage());
            return 0;
        }
    }

    /**
     * Takes a String value as the 1st input parameter
     * and the specified startIndex
     * up to last character of the 1st input parameter.
     */
    public String mySubstring(String parameter1, int startIndex) {
        String result;
        String[] stringArray = new String[parameter1.length()];

        try {
            //starts reading from left to right
            if (startIndex >= 0) {
                result = this.mySubstring(parameter1, startIndex, parameter1.length() - startIndex);
            } else {
                //starts reading from right to left
                result = this.mySubstring(parameter1, startIndex, -(startIndex));
            }
            return result;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You specified an invalid range: " + e.getMessage());
            return null;
        }
    }

    /**
     * Takes an Integer value as the 1st input parameter
     * and the specified startIndex
     * up to last character of the 1st input parameter.
     */
    public Integer mySubstring(Integer parameter1, Integer startIndex) {

        String convertedInt = Integer.toString(parameter1);
        int result;

        try {
            //starts reading from left to right
            if (startIndex >= 0) {
                result = this.mySubstring(parameter1, startIndex, convertedInt.length() - startIndex);
            } else {
                //starts reading from right to left
                result = this.mySubstring(parameter1, startIndex, -(startIndex));
            }
            return result;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You specified an invalid range: " + e.getMessage());
            return 0;
        }
    }


    /**
     * This method takes 2 input parameters, one String value
     * and another String value, then checks to see if the latter
     * is a subset of the first one. It returns either true or false.
     */
    public boolean mySubstring(String parameter1, String parameter2) {

        StringBuilder inputParameter = new StringBuilder();
        StringBuilder checkedParameter = new StringBuilder();

        String[] stringArray = new String[parameter1.length()];
        String[] param2 = new String[parameter2.length()];

        //starts reading from left to right
        for (int i = 0; i < stringArray.length; i++) {
            inputParameter.append(parameter1.charAt(i));
        }

        for (int j = 0; j < param2.length; j++) {
            checkedParameter.append(parameter2.charAt(j));
        }

        if (inputParameter.toString().contains(checkedParameter.toString())) {
            return true;
        }
        return false;
    }

    /**
     * This method takes 2 input parameters: the 1st String value and the 2nd String value,
     * then checks to see if the latter is a subset of the first one.
     * If it is a subset, then the method returns the 1st input parameter without the subset.
     * e.g. mySubsequence("Wonderful", "ful"), the value returned being "Wonder".
     */
    public String mySubsequence(String parameter1, String parameter2) {

        StringBuilder inputParameter = new StringBuilder();
        StringBuilder checkedParameter = new StringBuilder();
        boolean checkIfContained = this.mySubstring(parameter1, parameter2);

        String[] param2 = new String[parameter2.length()];

        int falseValue = 0;
        for (int i = 0; i < param2.length; i++) {

            while (!checkIfContained) {
                falseValue = 1;
                break;
            }
            checkedParameter.append(parameter2.charAt(i));
        }

        String[] mySplitValue = parameter1.split(checkedParameter.toString());
        for (String finalValue : mySplitValue) {
            inputParameter.append(finalValue);
        }

        if (falseValue == 0) {
            return inputParameter.toString();
        } else {
            return null;
        }
    }
}
