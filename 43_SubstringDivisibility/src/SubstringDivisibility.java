import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SubstringDivisibility {
    public static void main(String [] args) throws FileNotFoundException {
        // make file for printing debug
        File file = new File("debug1.txt");
        // print to file
        System.setOut(new PrintStream(file));

        // set numbers
        long i = 1406357289L; // 1,000,000,000
        long sum = 0;
        long number;

        // while loop until we hit 10,000,000,000
        while (i < 10000000000L) {
            number = i;

            long check = number / 1000000;
            long two = check % 1000; //1  998  876543
            // 2 check
            if (two % 2 == 0) {
                check = number / 100000;
                long three = check % 1000; //19  988  76543
                // 3 check
                if (three % 3 == 0) {
                    check = number / 10000;
                    long five = check % 1000; //199  887  6543
                    // 5 check
                    if (five % 5 == 0) {
                        check = number / 1000;
                        long seven = check % 1000; //1998  876  543
                        // 7 check
                        if (seven % 7 == 0) {
                            check = number / 100;
                            long eleven = check % 1000; //19988  765  43
                            // 11 check
                            if (eleven % 11 == 0) {
                                check = number / 10; // 199887  654  3
                                long thirteen = check % 1000;
                                // 13 check
                                if (thirteen % 13 == 0) {
                                    check = number; // 1998876  543
                                    long seventeen = check % 1000;
                                    // 17 check
                                    if (seventeen % 17 == 0) {
                                        sum += checkNumberForAdd(i);
                                    }
                                    i++;
                                } else {
                                    // 13 remediation
                                    i = (check + (13 - (thirteen % 13))) * 10;
                                    i = checkIfTenDigits(i);
                                }//end 13 check
                            } else {
                                // 11 remediation
                                i = (check + (11 - (eleven % 11))) * 100;
                                i = checkIfTenDigits(i);
                            }//end 11 check
                        } else {
                            // 7 remediation
                            i = (check + (7 - (seven % 7))) * 1000;
                            i = checkIfTenDigits(i);
                        }//end 7 check
                    } else {
                        // 5 remediation
                        i = (check + (5 - (five % 5))) * 10000;
                        i = checkIfTenDigits(i);
                    }//end 5 check
                } else {
                    // 3 remediation
                    i = (check + (3 - (three % 3))) * 100000;
                    i = checkIfTenDigits(i);
                }//end 3 check
            } else {
                // 2 remediation
                i = (check + 1) * 1000000;
                i = checkIfTenDigits(i);
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
        System.out.println("Checking number: " + i);
        for (int j = 0; j < 10; j++) {
            if (!str.contains(Integer.toString(j))) {
                System.out.println("Failed on: " + j);
                return 0;
            }
        }
        System.out.println("Passed: " + i);
        return i;
    }
}
