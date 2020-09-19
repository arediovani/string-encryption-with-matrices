public class Decryption extends Encryption {

    private int[][] DeafultKeyInverted = {{-1, -10, -8}, {-1, -6, -5}, {0, -1, -1}};
    private int[][] CostumKeyInverted;
    private int[][] Decrypted;
    public void Decryption(){

    }

    public Decryption() {
    }

    public void Decrypt(){

setDecrypted(ArrayMultiplication(getEncoded(),getDeafultKeyInverted()));
    }

    public int[][] getDeafultKeyInverted() {
        return DeafultKeyInverted;
    }

    public void setDeafultKeyInverted(int[][] deafultKeyInverted) {
        DeafultKeyInverted = deafultKeyInverted;
    }

    public int[][] getCostumKeyInverted() {
        return CostumKeyInverted;
    }

    public void setCostumKeyInverted(int[][] costumKeyInverted) {
        CostumKeyInverted = costumKeyInverted;
    }

    public int[][] getDecrypted() {
        return Decrypted;
    }

    public void setDecrypted(int[][] decrypted) {
        Decrypted = decrypted;
    }
}
