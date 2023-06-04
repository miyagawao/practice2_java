// 整数を要素に持つ配列の中で、「奇数の要素」と「偶数の要素」の和をそれぞれ求め、出力
class Main13 {
  public static void main(String[] args) {
    int [] numbers = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    for (int number: numbers) {
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }
    }
    
    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}