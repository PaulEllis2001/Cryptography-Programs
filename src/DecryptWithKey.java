import java.util.ArrayList;

public class DecryptWithKey {
    public static void main(String[] args){
        char[] key = "nlxcobwrjvfuqasgekyhmztidp".toUpperCase().toCharArray();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        char[] message = ("EXDWYQNEW LXAEQ EPNOE ZHXU LXAEQ EWNWQ DOAFQHEAWJ WX UASHXO WQSYOXTXGJ NTT NHQNE LQWKQQO" +
                "ZQBQHNT KNJ NOB WYQ LXAEQ HAFQH WYQ XTBQH NHQN RDEW EXDWY XZ WYQ DOAFQHEAWJ SNO LQ" +
                "BQESHALQB NE N SHXEE LQWKQQO WYQ OXHWY QOB NOB WYQ LXAEQ LQOSY WYQ HQEW XZ EXDWYQNEW LXAEQ" +
                "KNE BQFQTXPQB AO WYQ TNEW WYAHWJ JQNHE KAWY EDLDHLNOEWJTQ YXUQE SXTDULAN FATTNGQ" +
                "EDLBAFAEAXO NOB WYQ XTBQH XHQGXO WHNAT YQAGYWE KQHQ WYQ ZAHEW UNRXH PTNOOQB SXUUDOAWAQE" +
                "AO EXDWYQNEW LXAEQ KAWY NO QTQUQOWNHJ NOB UABBTQ ESYXXT NTT KAWYAO KNTCAOG BAEWNOSQ ZHXU" +
                "NTT YXUQE WYQ EDLBAFAEAXO AE TXSNWQB NW WYQ AOWQHEQSWAXOE XZ AOWQHEWNWQ ABNYX NOB" +
                "ZQBQHNT KNJ ZXHUQH DE YAGYKNJ KYASY NHQ NTT UNRXH NHWQHAQE WX GQW NOJKYQHQ AO LXAEQ WYQ" +
                "EDLBAFAEAXO N LNEQLNTT SXUPTQM NOB EKAUUAOG PXXTE KQHQ BQFQTXPQB NHXDOB WYQ EAUPTXW EPXHWE" +
                "SXUPTQM WYQ ZAQTBE NHQ LDATW XFQH NO XTB TNOBZATT NOB BDUP NOB WYQ ZAQTBE NOB GHNFQT PNHCAOG" +
                "TXW NTTXK HNBXO GNEQE WX QESNPQ WYHXDGY WYQ GHXDOB").toCharArray();

        ArrayList<Character> keyArrList = new ArrayList<>();
        ArrayList<Character> alphaArrList = new ArrayList<>();

        for(int i = 0; i< 26; i++){
            keyArrList.add(key[i]);
            alphaArrList.add(alphabet[i]);
        }
        /*
        StringBuilder output = new StringBuilder();
        for(char c : message){
            if(c == ' '){
                output.append(c);
            } else {
                for(char k : key){
                    if(c == k){
                        int loc = keyArrList.indexOf(k);
                        output.append(alphabet[loc]);
                        break;
                    }
                }
            }
        }*/

        for(int i = 0; i < 26; i++){
            System.out.println("The key value: " + keyArrList.get(i)  + " is equal to: " + alphaArrList.get(i));
        }

        //System.out.println(output.toString());
    }
}
