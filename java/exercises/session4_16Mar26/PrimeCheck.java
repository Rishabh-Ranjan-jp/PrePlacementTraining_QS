class PrimeCheck{
    public static void main(String[] args){
        System.out.println("1 is Prime: "+PrimeUtility.isPrime(1));
        System.out.println("2 is Prime: "+PrimeUtility.isPrime(2));
        System.out.println("3 is Prime: "+PrimeUtility.isPrime(3));
        System.out.println("4 is Prime: "+PrimeUtility.isPrime(4));
        System.out.println("278347 is Prime: "+PrimeUtility.isPrime(278347));
    }
}

class PrimeUtility{
    public static boolean isPrime(int num){
        if (num == 1)
            return false;
        else if (num == 2)
            return true;
        else if (num%2 == 0)
            return false;
        for(int i = 3; i<num/2; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}