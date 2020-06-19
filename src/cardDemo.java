import java.util.*;
class Card{
    public String rank; //牌面值
    public String suilt;//花色

    public Card(String rank, String suilt) {
        this.rank = rank;
        this.suilt = suilt;
    }


    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suilt='" + suilt + '\'' +
                '}';
    }
}
public class cardDemo {
    public static void main(String[] args) {
    //1.买一副牌
        List<Card> list = buyPoker();
        System.out.println(list);
    //2.洗牌
        Collections.shuffle(list);
        System.out.println(list);
    //3.发牌 假设三个玩家，每个人发5张牌
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 3;j++){
                players.get(j).add(list.remove(0));
            }
        }
    //4.3个玩家手中的牌
    for(int i = 0;i < 3;i++){
        System.out.println(players.get(i));
    }
    }
    //买一副牌
    static String[] suits = {"♥","♠","♣","♦"};
    private static List<Card> buyPoker(){
        List<Card> list = new ArrayList<>();
        for(int i = 0;i < 4;i++)
        {
            for(int j = 2; j<= 10;j++){
                list.add(new Card(String.valueOf(j),suits[i]));
            }
            list.add(new Card("J",suits[i]));
            list.add(new Card("Q",suits[i]));
            list.add(new Card("K",suits[i]));
            list.add(new Card("A",suits[i]));
        }
        return list;
    }
}
