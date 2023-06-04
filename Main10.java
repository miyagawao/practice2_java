class Main10 {
  public static void main(String[] args) {
    // 変数namesに、配列を代入してください("にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ")
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
    // インデックス番号が0の要素を出力してください
    System.out.println(names[0]);
    
    // インデックス番号が2の要素を出力してください
    System.out.println(names[2]);
    
    // 変数languagesを定義し、配列を代入してください("Ruby", "PHP", "Python")
    String[] languages = {"Ruby", "PHP", "Python"};
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
    
    // インデックス番号が「1」の要素を「Java」で上書きしてください
    languages[1] = "Jave";
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
  }
}