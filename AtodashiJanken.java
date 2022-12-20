import java.util.Scanner;
import java.util.Random;

class AtodashiJanken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("どの手を出しますか");
        System.out.println("グーなら0,チョキなら1,パーなら2を入力してください");
        System.out.print("そんなの選べないよって場合は3を入力してください");
        int n = scanner.nextInt();
        if (n == 3) {
            Random rnd = new Random();
            n = rnd.nextInt(2);
        }
        String me[] = { "グー", "チョキ", "パー" };
        System.out.println("あなたは" + me[n] + "を出しました");

        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }

            switch (me[n]) {
                case "グー":
                    System.out.println("相手はパーを出しました！！");
                    break;
                case "チョキ":
                    System.out.println("相手はグーを出しました！！");
                    break;
                case "パー":
                    System.out.println("相手はチョキを出しました！！");
                    break;
            }
            System.out.println("残念でした〜、あなたの負けどぅえ〜す！！");

        } catch (InterruptedException e) {
            System.out.println("割り込みが発生しました");
        }
    }
}
