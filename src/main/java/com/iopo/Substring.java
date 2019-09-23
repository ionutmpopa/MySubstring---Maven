package com.iopo;

public class Substring {

    /**
     * This method takes 3 input parameters and returns new String object
     * containing the substring of the 1st parameter from specified startIndex
     * with the desired length specified as the 3rd parameter.
     */
    public String mySubstring(String str, int startIndex, int length) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            //Starts reading from left to right.
            if (startIndex >= 0) {
                for (int i = 0; i <= str.length(); i++) {
                    if (i == (startIndex + 1)) {
                        stringBuilder.append(str.charAt(i - 1));
                        for (int j = i; j < (startIndex + length); j++) {
                            stringBuilder.append(str.charAt(j));
                        }
                    }
                }
            } else {
                //Starts reading from right to left.
                for (int i = str.length(); i > 0; i--) {
                    if (i == (str.length() + startIndex) + 1) {
                        stringBuilder.append(str.charAt(i - 1));
                        for (int j = i; j < ((str.length() + startIndex) + length); j++) {
                            stringBuilder.append(str.charAt(j));
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
    public Integer mySubstring(Integer str, Integer startIndex, Integer length) {

        String convertedInt = Integer.toString(str);
        StringBuilder stringBuilder = new StringBuilder();

        try {
            //Starts reading from left to right.
            if (startIndex >= 0) {
                for (int i = 0; i <= convertedInt.length(); i++) {
                    if (i == (startIndex + 1)) {
                        stringBuilder.append(convertedInt.charAt(i - 1));
                        for (int j = i; j < (startIndex + length); j++) {
                            stringBuilder.append(convertedInt.charAt(j));
                        }
                    }
                }
            } else {
                //Starts reading from right to left.
                for (int i = convertedInt.length(); i > 0; i--) {
                    if (i == ((convertedInt.length() + startIndex) + 1)) {
                        stringBuilder.append(convertedInt.charAt(i - 1));
                        for (int j = i; j < ((convertedInt.length() + startIndex) + length); j++) {
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
    public String mySubstring(String str, int startIndex) {

        String result;
        try {
            //starts reading from left to right
            if (startIndex >= 0) {
                result = this.mySubstring(str, startIndex, str.length() - startIndex);
            } else {
                //starts reading from right to left
                result = this.mySubstring(str, startIndex, -(startIndex));
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
    public Integer mySubstring(Integer str, Integer startIndex) {

        String convertedInt = Integer.toString(str);
        int result;

        try {
            //starts reading from left to right
            if (startIndex >= 0) {
                result = this.mySubstring(str, startIndex, convertedInt.length() - startIndex);
            } else {
                //starts reading from right to left
                result = this.mySubstring(str, startIndex, -(startIndex));
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
    public boolean mySubstring(String str, String str2) {

        StringBuilder inputParameter = new StringBuilder();
        StringBuilder checkedParameter = new StringBuilder();

        //starts reading from left to right
        for (int i = 0; i < str.length(); i++) {
            inputParameter.append(str.charAt(i));
        }

        for (int j = 0; j < str2.length(); j++) {
            checkedParameter.append(str2.charAt(j));
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
    public String mySubsequence(String str, String str2) {

        StringBuilder inputParameter = new StringBuilder();
        StringBuilder checkedParameter = new StringBuilder();
        boolean checkIfContained = this.mySubstring(str, str2);

        int falseValue = 0;
        for (int i = 0; i < str2.length(); i++) {

            while (!checkIfContained) {
                falseValue = 1;
                break;
            }
            checkedParameter.append(str2.charAt(i));
        }

        String[] mySplitValue = str.split(checkedParameter.toString());
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
