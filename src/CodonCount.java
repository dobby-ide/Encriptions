import java.util.HashMap;

public class CodonCount {
    private HashMap<Integer, String> codons;

    public CodonCount(){
        codons = new HashMap<Integer, String>();
    }
    public void buildCodonMap(int start, String dna){
        int lenght = dna.length();
        System.out.println(lenght);

        for (int i = start; i < dna.length(); i = i+3){
            int remain = dna.length() - (i);
            if(remain <= 2){
                System.out.println("less than 3");
            }
            else{
                String codon_ = dna.substring(i, i+3);
                System.out.println(codon_);

            }

        }
       String codon1 =  dna.substring(start, start+2);
    }

    public static void main(String[] args) {
        CodonCount cc = new CodonCount();
        cc.buildCodonMap(0, "CGTTCAAGTTCAT");

    }
}
