import java.lang.reflect.Array;
import java.util.Scanner;
public class Encryption {
    private int[][] DeafultKey = {{1, -2, 2}, {-1, 1, 3}, {1, -1, -4}};
    private int[][] CostumKey=new int [3][3];
    private int[][] DeafultKeyInverted = {{-1, -10, -8}, {-1, -6, -5}, {0, -1, -1}};
    private int[][] Uncoded;
    private int[][] Encoded=new int [getDivisible()][3];
    private String[] SentenceArray;
    private String Sentence;
    private int Divisible;
    private int SentenceLength;

    Scanner sc=new Scanner (System.in);

    public Encryption(){
    this.sc=sc;
    }

    public void CreateCostumKey(){
        for(int row=0; row<3; row++)
            for(int colum=0; colum<3;colum++)
            setCostumKey(row,colum,sc.nextInt());

        System.out.println("Key set successfully");
    }

    public void SentenceToArray(){
        setSentence(sc.next());

        setSentenceLength(getSentence().length());

        while (!(getSentenceLength()%3==0)){
                 int space=getSentenceLength();
                 space++;
            setSentenceLength(space);
        }
        setDivisible(getSentenceLength()/3);

        setUncoded(getDivisible(),3);
        SentenceArray = getSentence().split("");
        int counter=0;
        for (int row = 0; row < getUncoded().length; row++) {

            for (int colum = 0; colum < getUncoded()[0].length; colum++) {
                setUncoded(row,colum,ConvertToInt(SentenceArray[counter]));
        }
        }
        

    }

    public void CreateEncoded(boolean keychoice){
        if(keychoice==true) {
            setEncoded(ArrayMultiplication(getUncoded(), getDeafultKey()));
        }

    }

    public int[][] ArrayMultiplication(int first[][], int second[][]){
        int [][] Final = new int[7][3];

        for (int i = 0; i < getDivisible(); ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 3; ++k) {
                    Final[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return Final;
    }


    public int ConvertToInt (String charackter){
        int number= Integer.parseInt(charackter);
        return number;
    }

    public String  ConvertToString(int value){
        String character = Integer.toString(value);
        return character;
    }

    public int[][] getUncoded() {
        return Uncoded;
    }

    public void setUncoded(int row, int colum, int converted) {
        Uncoded[row][colum]=converted;
    }
    public void setUncoded(int row, int colum){
        Uncoded=new int [row][colum];
    }

    public String getSentence() {
        return Sentence;
    }

    public void setSentence(String sentence) {
        Sentence = sentence;
    }

    public int getSentenceLength() {
        return SentenceLength;
    }

    public void setSentenceLength(int sentenceLength) {
        SentenceLength = sentenceLength;
    }

    public int getDivisible() {
        return Divisible;
    }

    public void setDivisible(int divisible) {
        Divisible = divisible;
    }

    public int[][] getCostumKey() {
        return CostumKey;
    }

    public void setCostumKey(int row, int colum , int value) {
        CostumKey[row][colum]= value;
    }

    public int[][] getEncoded() {
        return Encoded;
    }

    public void setEncoded(int[][] EncodedArray) {
        Encoded = EncodedArray;
    }

    public int[][] getDeafultKey() {
        return DeafultKey;
    }

    public void setDeafultKey(int[][] deafultKey) {
        DeafultKey = deafultKey;
    }
}
