public class SubstringDivisibility {
    public static void main(String [] args) {
        // set numbers
        long number = 1023456789L; // 1,023,456,789
        long sum = 0;
        long check;
        long num;

        // while loop until we hit 10,000,000,000
        while (number < 9876543210L) {
            check = number / 1000000;
            num = check % 1000; //1  998  876543
            // 2 check
            if (num % 2 == 0) {
                check = number / 100000;
                num = check % 1000; //19  988  76543
                // 3 check
                if (num % 3 == 0) {
                    check = number / 10000;
                    num = check % 1000; //199  887  6543
                    // 5 check
                    if (num % 5 == 0) {
                        check = number / 1000;
                        num = check % 1000; //1998  876  543
                        // 7 check
                        if (num % 7 == 0) {
                            check = number / 100;
                            num = check % 1000; //19988  765  43
                            // 11 check
                            if (num % 11 == 0) {
                                check = number / 10; //199887  654  3
                                num = check % 1000;
                                // 13 check
                                if (num % 13 == 0) {
                                    check = number; //1998876  543
                                    num = check % 1000;
                                    // 17 check
                                    if (num % 17 == 0) {
                                        sum += checkNumberForAdd(number);
                                    }
                                    number++;
                                } else {
                                    // 13 remediation
                                    number = (check + (13 - (num % 13))) * 10;
                                    number = checkIfTenDigits(number);
                                }//end 13 check
                            } else {
                                // 11 remediation
                                number = (check + (11 - (num % 11))) * 100;
                                number = checkIfTenDigits(number);
                            }//end 11 check
                        } else {
                            // 7 remediation
                            number = (check + (7 - (num % 7))) * 1000;
                            number = checkIfTenDigits(number);
                        }//end 7 check
                    } else {
                        // 5 remediation
                        number = (check + (5 - (num % 5))) * 10000;
                        number = checkIfTenDigits(number);
                    }//end 5 check
                } else {
                    // 3 remediation
                    number = (check + (3 - (num % 3))) * 100000;
                    number = checkIfTenDigits(number);
                }//end 3 check
            } else {
                // 2 remediation
                number = (check + 1) * 1000000;
                number = checkIfTenDigits(number);
            }//end 2 check
        }// end while loop
        System.out.println("Sum: " + sum);
    }

    public static long checkIfTenDigits(long i) {
        while (i < 1000000000) {
            i *= 10;
        }
        return i;
    }

    public static long checkNumberForAdd(long i) {
        // check that each digit 0-9 is in the number
        String str = Long.toString(i);
        for (int j = 0; j < 10; j++) {
            if (!str.contains(Integer.toString(j))) {
                return 0;
            }
        }
        System.out.println("Passed: " + i);
        return i;
    }
}