package org.elsys.ip.hw.prime;

public class IsPrime {
    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.-]+");
    }

    public static Integer tryParse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (String arg : args) {
            if (arg.equals(" ")) continue;
            if (!isNumeric(arg)) {
                System.out.println(arg + " is not a number");
                continue;
            }
            if (arg.contains(".")) {
                System.out.println(arg + " is not an integer");
                continue;
            }
            if (tryParse(arg) != null)
            {
                int n = tryParse(arg);
                if(isPrime(n))
                    System.out.println(arg + " is a prime");
                else
                    System.out.println(arg + " is not a prime");
            }
            else System.out.println(arg + " is out of bound");
        }
    }
}


