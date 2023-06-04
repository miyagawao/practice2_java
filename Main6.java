class Main6 {
  public static void main(String[] args) {
    int n = 0;
    // switch文を用いて、変数nの値に応じて条件分岐をしてください(変数1の時”大吉です”、変数2の時”吉です”)
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
      // defaultを用いて、変数nの値がどのcaseにも合致しない場合の処理を記述してください
      default:
        System.out.println("凶です");
        break;
    }
    
  }
}