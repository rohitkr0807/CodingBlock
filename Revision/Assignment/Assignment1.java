package Revision.Assignment;

public class Assignment1 {
    public static void main(String[] args) {
//        System.out.println(reverse(345));
//        printPatter1(5);
//        print(6);
//        printFib(5);
//        printAllprime(12);
//        checkPrime(24);
//        System.out.println(nthfibonacci(7));
//        printAllprimeNum(23);
//        sumOddEven(2356);
//        printAlternateLine(34);
//        printRowNum(23);
//        printRow(8);
//        System.out.println(Hcf(7,17));
        System.out.println(log(32, 2));
    }

    public static void printPatter1(int n) {
        int row = 1;
        int numspaces = n / 2;
        int numstars = 1;
        while (row <= n) {
            int spaces = 1;
            while (spaces <= numspaces) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while (stars <= numstars) {
                System.out.print("*");
                stars++;
            }
            if (row > (n / 2)) {
                numspaces++;
                numstars = numstars - 2;
            } else {
                numspaces--;
                numstars += 2;
            }
            System.out.println();


            row++;
        }

    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void print(int n) {
        int row = 1;
        int numstars = 1;
        int numspaces = n / 2;
        while (row <= n) {
            int spaces = 1;
            while (numspaces >= spaces) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while (stars <= numstars) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            if (row > n / 2) {
                numspaces = numspaces + 1;
                numstars = numstars - 2;
            } else {
                numspaces = numspaces - 1;
                numstars = numstars + 2;
            }
            row++;
        }
    }

    public static void printFib(int n) {
        int fNo = 0;
        int sNo = 1;
        int counter = 1;
        System.out.println(0);
        while (counter <= n) {
            int sum = fNo + sNo;
            fNo = sNo;
            sNo = sum;
            System.out.println(fNo);
            counter++;
        }

    }

    public static void printAllprime(int n) {
        for (int num = 2; num <= n; num++) {
            int counter = 2;
            boolean isprime = true;
            while (counter * counter <= num) {
                if (num % counter == 0) {
                    isprime = false;
                    break;
                }
                counter++;
            }
            if (isprime == true) {
                System.out.println(num);
            }
        }

    }

    public static void checkPrime(int n) {
        int counter = 2;
        while (counter * counter <= n) {
            if (n % counter == 0) {
                System.out.println("Not prime");
                return;
            }
            counter++;
        }
        System.out.println("Prime");
    }

    public static int nthfibonacci(int num) {
        int fNo = 0;
        int Sno = 1;
        if (num == 0) {
            return 0;
        }
        while (num > 0) {
            int sum = fNo + Sno;
            fNo = Sno;
            Sno = sum;
            num--;
        }
        return fNo;
    }

    public static void printAllprimeNum(int num) {
        int counter = 2;
        while (counter <= num) {
            boolean isPrime = true;
            int divisor = 2;
            while (counter > divisor) {
                if (counter % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime) {
                System.out.println(counter);
            }
            counter++;
        }

    }

    public static void sumOddEven(int num) {
        int evensum = 0;
        int counter = 0;
        int oddsum = 0;
        while (num > 0) {
            int rem = num % 10;
            if (counter % 2 == 0) {
                evensum = evensum + rem;
            } else {
                oddsum = oddsum + rem;
            }
            counter++;


            num /= 10;
        }
        System.out.println("Sum of odd number is:" + oddsum);
        System.out.println(evensum);
    }

    public static void printAlternateLine(int num) {
        int row = 1;
        int col = 1;
        int value = 1;
        while (row <= num) {
            col = 1;
            while (col <= row) {
                System.out.print(value + "\t");
                value++;
                col++;
            }
            System.out.println();

            row++;
        }
    }

    public static void printRowNum(int num) {
        int row = 1;
        int col = 1;
        while (row <= num) {
            col = 1;
            while (col <= row) {
                if (col == 1 || col == row) {
                    System.out.print(row + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
                col++;
            }
            System.out.println();
            row++;
        }

    }

    public static void printRow(int N) {
        int row = 0, col = 0, value = 1;

        while (row < N) {
            col = 0;
            value = 1;

            while (col <= row) {
                System.out.print(value + "\t");
                value = (value * (row - col)) / (col + 1);
                col++;
            }

            System.out.println();
            row++;
        }
    }

    public static int Hcf(int a, int b) {

        if (b > a) {
            int temp = b;
            b = a;
            a = temp;
        }
        int divisor = a;
        int dividend = b;
        while (divisor != 0) {
            int temp = divisor;
            int rem = dividend % divisor;
            divisor = rem;
            dividend = temp;
        }
        return dividend;

    }

    public static int log(int num, int base) {
        int count = 0;
        int product = 1;
        while (product != num) {
            product = base * product;
            count++;
        }

        return count;
    }

    public static int bin2Dec(int Binarynum) {
        int dec = 0;
        int twoPower = 1;
        while (Binarynum != 0) {
            int rem = Binarynum % 10;
            int component = rem * twoPower;
            dec = dec + component;
            twoPower = twoPower * 2;
            Binarynum /= 10;
        }
        return dec;
    }

    public static int dec2Bin(int decnum) {
        int bin = 0;
        int tenPower = 1;
        while (decnum != 0) {
            int rem = decnum % 2;
            int component= rem*tenPower;
            bin=bin+component;
            tenPower = tenPower * 10;
            decnum /= 2;
        }
        return bin;
    }

}