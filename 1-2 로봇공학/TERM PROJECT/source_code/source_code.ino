#include <LiquidCrystal.h>
#define TRIG 2
#define ECHO 3
#define d7 4
#define d6 5
#define d5 6
#define d4 7
#define BUZ  8
#define RED 10
#define enable 11
#define rs 12
#define GREEN 13
LiquidCrystal lcd(rs,enable,d4,d5,d6,d7);

unsigned long distance = 0;
double temp;
int melody[] = {262, 330, 392, 523};

void setup() {
  Serial.begin(9600);
  pinMode(BUZ, OUTPUT);  // 피에조 부저 출력 설정  
  pinMode(TRIG, OUTPUT);  // 초음파 출력 설정
  pinMode(ECHO, INPUT);   // 초음파 입력 설정
  pinMode(RED, OUTPUT);
  pinMode(GREEN, OUTPUT);
  lcd.begin(16,2); //cols and rows
  lcd.setCursor(0,0); 
} 
void loop() {  
  digitalWrite(TRIG, LOW);
  delayMicroseconds(2);
  digitalWrite(TRIG, HIGH);
  delayMicroseconds(5);
  digitalWrite(TRIG, LOW);      
  distance = pulseIn(ECHO, HIGH) / 29 / 2;  // cm 단위로 변경
  delay(300);
  if (distance < 10)
  {
    float temp = (5 * analogRead(A0) * 100) / 1024;
    if (temp >= 36.0 && temp <= 37.5)
    {
      lcd.setCursor(0,0);
      lcd.print("Temp is ");
      lcd.setCursor(0,1);
      lcd.print(temp);
      digitalWrite(GREEN, OUTPUT);
      for (int i = 0; i < 4; i++)
      {
        tone(8, melody[i], 500);
        delay(500);
        noTone(8);
      }
      delay(3000);
    }

    else
    {
      lcd.setCursor(0,0);
      lcd.print("Temp is ");
      lcd.setCursor(0,1);
      lcd.print(temp);
      digitalWrite(RED, OUTPUT);
      tone(BUZ, 880, 500);
      delay(1000);
      noTone(BUZ);  
      delay(3000);
    }
  } 
}
