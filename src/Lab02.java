// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



/*1.give a complete description of AirPurifier class
-what should be instance variables?
 model(String)
 serialNo(int)
 isOn(boolean)
 fanspeed(int)
 pm25(int)
-what should be instance methods?
  void turnOff()
  void setFanSpeed(int speed)
  void setPM25(int value)
-what should be class variables?
 static maxfanspeed(int)
 static minfanspeed(int)
 static namecompany(String)
 static modelCount(int)
-what should be class methods?
  static int getModelCount ()
 2.for each method proposed above, how do you plan to implement it?
give an overview of the computation
what's needed as inputs?
what's to be returned?
= void turnOff() - void turnOff(): input: none, return: void.
  void setFanSpeed(int speed)input: desired speed, return: void.
  void setPM25(int value) รับค่า pm2.5 ไม่ return void  เก็บค่าเเล้วปรับ fanspeed ตามช่วง (≤100 = 1, ≤150 = 2, มากกว่านั้น = 3)
  static int getModelCount () ไม่รับ input,return ค่า modelCount
*/
public class Lab02 {
    public static void main(String[] args) {
        AirPurifier a1 = new AirPurifier("Xiaomi", 1001);
        AirPurifier a2 = new AirPurifier("Dyson", 2002);

        a1.turnOn();
        System.out.println("a1 on? " + a1.isOn);          // true

        a1.setFanSpeed(2);
        System.out.println("a1 speed: " + a1.fanSpeed);   // 2

        a1.setFanSpeed(9);                                // เกินขอบเขต ต้องไม่เปลี่ยน
        System.out.println("a1 speed: " + a1.fanSpeed);   // ยังเป็น 2

        a1.setPM25(160);
        System.out.println("a1 speed: " + a1.fanSpeed);   // 3

        a1.turnOff();
        System.out.println("a1 on? " + a1.isOn);          // false

        System.out.println("Count: " + AirPurifier.getModelCount()); // 2
    }
}
