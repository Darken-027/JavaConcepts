package arrays;

public class UnidimensionalArrays {
    public static void main(String[] args) {
        //Declare an array of doubles 
        double accounts[];
        accounts = new double[100];
        accounts[3] = 1340.0;
        System.out.println("Account 3 must: $" + accounts[3]);

        //Other form[[]
        double accounte[] = new double [1001];
        accounte[4] = 122.45;
        System.out.println("Account 4 must: $" + accounte[3]);
    }
}
