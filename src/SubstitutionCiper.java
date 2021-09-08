import java.lang.reflect.Array;
import java.util.ArrayList;
public class SubstitutionCiper {
    public static void main(String[] args){
        char[] message = "EXDWYQNEWLXAEQEPNOEZHXULXAEQEWNWQDOAFQHEAWJWXUASHXOWQSYOXTXGJNTTNHQNELQWKQQOZQBQHNTKNJNOBWYQLXAEQHAFQHWYQXTBQHNHQNRDEWEXDWYXZWYQDOAFQHEAWJSNOLQBQESHALQBNENSHXEELQWKQQOWYQOXHWYQOBNOBWYQLXAEQLQOSYWYQHQEWXZEXDWYQNEWLXAEQKNEBQFQTXPQBAOWYQTNEWWYAHWJJQNHEKAWYEDLDHLNOEWJTQYXUQESXTDULANFATTNGQEDLBAFAEAXONOBWYQXTBQHXHQGXOWHNATYQAGYWEKQHQWYQZAHEWUNRXHPTNOOQBSXUUDOAWAQEAOEXDWYQNEWLXAEQKAWYNOQTQUQOWNHJNOBUABBTQESYXXTNTTKAWYAOKNTCAOGBAEWNOSQZHXUNTTYXUQEWYQEDLBAFAEAXOAETXSNWQBNWWYQAOWQHEQSWAXOEXZAOWQHEWNWQ84ABNYX21NOBZQBQHNTKNJZXHUQHDEYAGYKNJKYASYNHQNTTUNRXHNHWQHAQEWXGQWNOJKYQHQAOLXAEQWYQEDLBAFAEAXONLNEQLNTTSXUPTQMNOBEKAUUAOGPXXTEKQHQBQFQTXPQBNHXDOBWYQEAUPTXWEPXHWESXUPTQMWYQZAQTBENHQLDATWXFQHNOXTBTNOBZATTNOBBDUPNOBWYQZAQTBENOBGHNFQTPNHCAOGTXWNTTXKHNBXOGNEQEWXQESNPQWYHXDGYWYQGHXDOB".toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(char a : arr){
            alphabet.add(a);
        }
        int total = 0;

        int[] frequencey = new int[26];

        for(char c : message){
            for(char a : alphabet){
                if(c == a){
                    frequencey[alphabet.indexOf(a)]++;
                    break;
                }
            }
            if(c != ' '){
                total++;
            }
        }

        System.out.println(total);
        int loop = 0;
        double[] f = new double[26];
        for(int i = 0; i < 26; i++){
            f[i] = frequencey[i];
            f[i] = f[i]/total;
            f[i] = f[i] * 100;
        }
        for(int i : frequencey){

            System.out.println(alphabet.get(loop) + ", " + f[loop]);
            loop++;
        }

    }
}
