import java.util.ArrayList;

import java.util.List;
import java.util.Random;

/**
 * 1.通过这个类来模拟创建一副牌，洗牌，发牌
 *
 */
public class Poker {

    //不加static的内部类，当我们创建card对象的时候，必须要依靠poker的实例才能创建
    static class Card {
        public String suit;//花色
        public String rank;//牌值

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {

            return String.format("(%s%s)",suit,rank);
//            return "Card{" +
//                    "suit='" + suit + '\'' +
//                    ", rank='" + rank + '\'' +
//                    '}';
        }
    }

    //构造牌
    public static List<Card> buyPoker() {
        String[] suits = {"♥","♠","♣","♦"};
        List<Card> poker = new ArrayList<>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 2; j <=10; j++) {
                Card card = new Card(suits[i],"" + j);
                poker.add(card);
            }
            poker.add(new Card(suits[i],"J"));
            poker.add(new Card(suits[i],"Q"));
            poker.add(new Card(suits[i],"K"));
            poker.add(new Card(suits[i],"A"));
        }
        return poker;
    }

    public static void shuffle(List<Card> poker) {
        Random random = new Random();
        for (int i = poker.size()-1; i > 0; i--) {
            int r = random.nextInt(i);
            swap(poker,i,r);
        }
    }
    private static void swap(List<Card> poker,int i, int r) {
        Card tmp = poker.get(i);
        poker.set(i,poker.get(r));
        poker.set(r,tmp);
    }

    public static void main(String[] args) {
        List<Card> poker = buyPoker();
//        Poker poker = new Poker();
//        poker.buyPoker();
        shuffle(poker);//洗牌

        //Collections.shuffle(poker);
        System.out.println(poker);

        //发牌，把牌发给3个玩家，每人发5张
        //通过嵌套List 来表示
        //每个玩家的手牌是一个List，多个玩家的手牌再放到一个List中
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < players.size(); j++) {
                //先获取到这个玩家
                List<Card> player = players.get(j);
                //再把poker中的最前面的元素发给当前玩家
                Card topCard = poker.remove(0);
                player.add(topCard);
            }
        }

        System.out.println("玩家1的手牌：");
        System.out.println(players.get(0));
        System.out.println("玩家2的手牌：");
        System.out.println(players.get(1));
        System.out.println("玩家3的手牌：");
        System.out.println(players.get(2));

    }

}
