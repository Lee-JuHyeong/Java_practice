import java.util.Calendar;

//class 선언
public class Hello {
}

//main method
public static void main(String[] args) {
}

//주석
// 한줄
/* 사이내용 모두 */
/** 사이내용 모두(javadoc명령어로 API생성 사용) */

//변수 선언
int ABC = 1;
double ABC;
ABC = 1;
char var1 = 'A';
String var2 = "AAA";
로컬변수 - 자신이 속한 블록배부에서만 사용가능
//변수저장
Scanner scanner(변수선언) = new Scanner(생성된 scanner변수에 저장)(System.in);(Scanner 생성)
String input = scanner.nextLine();

/* 
기본타입 boolean byte char short int long float double
접근제한자 private protrcted public
클래스 class abstract interface extends implenents enum
객체 new instanceof this super null
메소드 void return
제어문 if else switch case efault for do while break continue
논리값 true false
예외처리 try catch finally throw throws
*/

//출력
System.out.println(ABC); //출력
System.out.print(ABC); //내용출력, 행바꿈
System.out.printf("나이: %d",25); //f실수 d정수 s문자열

//조건문 if switch
if(){}

if(){}
else{}

switch(){
    case 값1: break;
    case 값2: break;
    default:(값12아닐시)
}

//반복문 for while do-while
for(int i=1;/*초기화식*/i<= 100;/*조건식*/i++/*증감식*/){
    sum = sum + i;
}
while(i <= 10)/*true일때 반복*/{
    System.out.println(1);
    i++;
}
do{실행문}/*샐행문 우선실행, 실행결과true경우 반복*/
while();

//break continue문
Label:/*레이블이 가르키는 반복문 탈출*/ for(){
    for(){
        break Label;
    }
}
//향상된 for문(배열 컬렉션 쉽게 처리)
for(2.타입변수 : 1.배열){
    3.실행문;
}
/*1. for문 첫 실행 1.배열에서 가져올 1번째값 존재 평가
  2. 값O 2.타입변수에 저장
  3. 3.실행문 살행
  4. 다시 1.배열 확인*/
int [] scores = {95,71,84,93,87};
int sum =0;
for(score : scores){
    sum = sum + score;
}

//참조타입 변수(객체object의 번지 참조하는 타입)
int[] scores = {10,20,30};
String 변수/*스택영역 생성,힙영역객체에 번지갑저장*/ = "문자열";/*힙영역 객체에 저장*/
//참조변수의 == , != 연산(동일한 객체참조인지 확인)
//null - 스택영역생성, 힙영역 객체 참조하지 않은 상태
//배열
타입[] 변수 = {1,2,3};
타입[] 변수 ;
변수 = new 타입[]{ };
//new 연산자 배열생성(배열먼저 생성후 값을 나중에 저장하고싶다)
타입 [] 변수 = new 타입[길이];

//다차원 배열(계단식 구조)
//2(행,세로)x3(열,가로) 행렬 만들기
int [][] scores = new int [2][3];

//객체를 참조하는 배열
String[] strArray = new String[3]
strArray[0] = "Java";
strArray[1] = "C++";
strArray[2] = "c#";

//배열 복사
//배열 생성 후 크기 변경X, 더 많은 공간 필요하다면 더 큰 배열 생성 이전 배열 값 복사(for문 System.arraycopy() 사용)
int[] oldIntArray = {1,2,3,4};
int[] newIntArray = new int[5];
for(int i= 0; i<oldIntArray.length; i++){
    newIntArray[i] = oldIntArray[i]; 
}
//System.arraycopy(src, srcPos, dest, destPos, length);
//src-원본 배열 srcPos-원본 배열에서 복사할 항목의 시작 인덱스 dest-새배열 destPos-새배열에 복사할 항목의 시작 인덱스 length-복사할 개수
String[] oldstrArray = {"j",'a','v'};
String[] newstrArray = new String[5];
System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length);

//열거 타입(참조 타입)
//열거 타입 선언: 열거 타입이름 정한후, 해당이름으로 소스파일(.java)생성
//이클립스 생성 방법 [file]-[new]-[enum]
week.java
public enum week{monday,...}
week today;
today = week.friday;

//날짜 요일 클래스
Calendar now = Calendar.getInstance();
//Calender.getInstance()메소드 이용 Calender 객체 얻기
//get()메소드 이용 : 연,월,일,요일,시간,분,초 얻기
int year = now.get(Calendar.YEAR);
int month = now.get(Calendar.MONTH);
int day = now.get(Calendar.DAY_OF_MONTH);
int week = now.get(Calendar.DAY_OF_WEEK);
int hour = now.get(Calendar.HOUR);
int minute = now.get(Calendar.MINUTE);
int second = now.get(Calendar.SECOND);

//객체(object): 물리적 존재,추상적 생각할수있는것 중 자신의 속성가지고 식별가능한것 속성(필드),동작(메소드) 구성
//사람 (이름 나이)속성, (달린다,멈춘다)동작
//메소드 호출: 객체가 다른 객체의 기능을 이용하는것
리턴값 = ~객체.메소드[객체,필드,메소드 접근시](매개값1,매개값2);[메소드 실행 위한 데이터]
int result = Calculator.add(10,20);

//클래스 선언
//'클래스 이름.java' 소스파일생성
public class 클래스이름{}
//소스파일에 두개이상 클래스 성성가능, 바이트 코드 파일(.class) 각각생성

//new연산자 사용 클래스로부터 객체 생성
new 클래스();
클래스 변수 ;
변수 = new 클래스();
클래스 변수 = new 클래스();
//변수가 객체 참조
Student s1 = new Student();

//클래스 구성 멤버
public class ClassName{
    int fieldname;          /*필드-객체의 데이터 저장되는 곳, 객체와 함께 존재*/
    ClassName(){...}        /*생성자-객체 생성시 초기화 역할, 필드 초기화 메소드 호출해서 객체 사용준비,리턴타입X*/
    void methodName(){...}  /*메소드-객체의 동작을 실행하는 실행블록,변수-메소드내에서만 사용 종료시 소멸,결과값 외부 리턴*/
}

//필드
//클래스 내부: 생성자,메소드에서 사용경우 필드 이름으로 읽고 변경
//클래스 외부: 클래스로 부터 객체 생성한뒤 필드 사용
person클래스
viod metod(){
    Car mycar = new Car();
    mycar.speed = 60;   /*객체 생성 후 필드값 변경*/
}
Car클래스
int speed;
Car(){
    speed = 0;
}
void method(...){
    speed = 10;
}

//생성자
//생성자를 실행하지 않고서는 클래스로 부터 객체를 만들 수 없음
//소스파일에서 생략하면 기본 생서자 바이트코드 파일에서 자동 추가
클래스(매개변수선언,...){
    객체의 최기화 코드
}
//매개변수-new연산자로 생성자를 호출할 때 외부의 값을 생성자 내부로 전달하는 역할
//객체 생성
Car myCar = new Car("그","검",300);
public class Car{
    Car(String model,String color,int maxSpeed){...}
}
//필드 초기화
/*기본초기값 말고 설정 방법 
    1.필드 선언 시 초기값주기(동일한 클래스로부터 생성하는 객체는 모두 같은 값을 가짐,생성 후 초기값 변경 가능) 
    2.생성자에서 초기값주기(외부에서 주는 다양한 값으로 변경할때) */
public class Korean{
    String name ;
    String nation = "Korea";
    String ssn;
    public Korean(String n,String s){
        name = n;
        ssn = s;
    } 
}
pubilc class KoreanE{
    public static void main(String[] args) {
        Korean k1 = new Korean("이주형","01001010");
        System.out.println(k1.nation+","+k1.name);
    }
}
//생성자 오버로딩
//외부의 다양한 데이터 이용하기 위한 생성자 다양화
//타입,개수,순서 다르게
public class Car{
    Car(){...}
    Car(String model){...}
    Car(String model, String color){...}
    Car(String model, String color, int Number){...}
}
//생성자에서 다른 생성자 호출 : this() ; 생성자 오버로딩 많아질 경우 중복된 코드 발생↑
public class Car{
    String model;
    String color;
    int Number;
    Car(){...}
    Car(String model){
        this(model,"은색",250);
    }
    Car(String model, String color){
        this(model,color,250);
    }
    Car(String model, String color, int Number){
        this.model=model;
        this.color=color;
        this.Number=Number;
    }
}

//메소드
리턴타입 메소드이름 ([매개변수선언,...]){
    실행할 코드 작성
}
//리턴값X인 메소드: void 기술
//리턴값O인 메소드: 타입에 따라
void powerOn(){...}
double divide(int x,int y){...}
//호출방법
poweron();
double result = divide(10,20);
//매개변수 선언
int plus(int x,int y){
    int result = x+y;
    return result;
}
//매개변수 개수 모를 경우
//매개변수 배열타입
int sum1 (int[] values){} /*배열의 항목 수 호출할때 결정*/
int [] values = {1,2,3};
int result = sum1(values);
int result = sum1(new int[]{1,2,3,4,5});
//메소드 호출시 자동 배열생성
int sum2(int ... values){}
int reslut = sum2(1,2,3);
int reslut = sum2(1,2,3,4,5);

//리턴 return 문
//리턴문 사용해서 리턴값지정해야함, return문 실행되면 메소드 즉시 종료
return 리턴값;
//리턴값없는 메소드 : return문 강제종료 역할로 사용

//메소드 호출
//객체 내부에서 호출
public class ClassName{
    void method1(String p1,int p2){}
    void method2(){
        method1("홍",10);
    }
    void method3(){
        int reslut1 = method1("김",20);
    }
}
//객체 외부에서 호출
클래스 참조변수 = new 클래스(매개값,...);
Car myCar = new Car();
myCar.run();
//메소드 오버로딩 : 매개값 타입을 보고 메소드 선택
int plus(int x,int y){}
double plus(double x,double y){}
