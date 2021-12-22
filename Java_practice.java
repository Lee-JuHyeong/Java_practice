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
//모든 객체는 생성자를 호출해야만 생성됨
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

//인스턴스 멤버 - 객체(인스턴스)를 생성한 후 사용할 수 있는 필드와 메소드(인스턴스 필드, 인스턴스 메소드)
public class Car{
    int gas; /*인스턴스 필드*/
    viod setSpeed(int speed){...} /*ㅡ인스턴스 메소드*/
}
//외부에서 사용위해 객체(인스턴스) 생성 후 참조변수(myCar)ㄹ 접근
Car myCar = new Car();
myCar.gas = 10;
myCar.setSpeed(20);

//this
/*객체 내부에서 인스턴스 멤버에 잡근하기 위해 this 사용, 객체는 자신을 this라고 함
    this.model(자신이 가지고 있는 model필드라는 뜻)*/
Car(String model){
    this.model = model;
}
//매개변수model의 값을 필드model에 저장

//정적멤버 - 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드(정적 메소드,정적 필드)
//정적멤버 선언 - static 키워드 추가적으로 붙여야함
public class 클래스{
    static 타입 필드 [=초기값];
    static 리턴 타입 메소드(매개변수선언,...){...}
}
//인스턴스 정적 판단 기준
//1. 객체마다 가지고 있어야 하 데이터라면 인스턴스 필드
//2. 공용 데이터라면 정적 필드 ex) 원둘레 파이(3.14)
public class Calculator{
    static double pi = 3.14;
    static int plus(int x, int y){...}
}
double result1 = 10*10*Calculator.pi;
int result2 = Calculator.plus(10,20);
//객체 참조변수로도 접근 가능
Calculator myCalculator = new Calculator();
double result1 = myCalculator.plus(10,20);
int result2 = 10*10*myCalculator.pi;
//정적 메소드 안에 인스턴스 필드,메소드 사용 불가능
public class ClassName{
    int field1;
    void method1() {...}
    static int field2;
    static void method2() {...}
    static void method3() {
        this.field1 = 10;   //컴파일 에러
        this.method1();     //컴파일 에러
        ClassName obj = new ClassName(); //참조변수로 내부에 인스턴스 접근 가능
        obj.field1 = 10;
        obj.method2();

        field2 = 10;
        method2();
    }
}
//main()메소드도 정적 메소드이므로 객체 생성없이 인스턴스 사용 불가

/*싱글톤 - 전체 플금램에서 단 하나의 객체만 만들도록 보장해야하는 경우 있음
    클래스 외부에서 new연산자로 생성자 호출 없도록 막아야함, private접근 제한자 붙여주어야함*/
//외부에서 호출할 수 있는 정적메소드인 getInstance() 선어하고 정적 필드에서 참조하고있는 자신의 객체를 리턴해줌
public class 클래스{
    private static 클래스 singleton = new 클래스(); //정적필드
    private 클래스(){} //생성자
    static 클래스 getIntance() { //정적 메소드
        return singleton;
    }
}
//외부에서 객체를 얻는 유일한 방법: getIntance() 메소드 호출하는 방법, getIntance()는 단 하나의
//객체만 리턴하기 때문에 동일한 객체 참조
클래스 변수1 = 클래스.getIntance();
클래스 변수2 = 클래스.getIntance();

//final 필드 - 초기값이 저장되면 이거이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없음
final 타입 필드 [= 초기값];
//1. 필드 선언시 초기값주기 2.생성자에서 주기
//final 상수 - 불변의 값(원주율 파이,지구 둘레,무게)이런 값을 저장하는 필드를 자바에서 상수라 불림
static final 타입 변수 = 초기값;
//상수 이름은 모두 대문자로 EARTH_AREA
//final 클래스 - 상속할 수 없는 클래스 final클래스는 부모클래스가 될 수 없음 자식 클래스도 만들수 없음
public final class 클래스{...}
//final 메소드 - 재정의할 수 없는 메소드
public final 리턴타입 메소드(매개변수,...){...}

//package - 클래스를 체계적으로 관리하기 위해
상위패키지.하위패키지.클래스
package 상위패키지.하위패키지; //패키지 선언
// 클래스를 이동할려면 패키지 전체를 이동시켜야함

//import문 - 해당 패키지의 클래스 또는 인터페이스를 가져와 사용할 것임을 컴파일러에게 알려줘야함
//패키지 선언과 클래스 선언 사이 작성
import 상위패키지,하위패키지.클래스이름;
import 상위패키지,하위패키지.*; //해당 패키지의 클래스들을 사용한다를 알려줌
package com.mycompany;
import com.hankook.Tire;
public class Car{
    Tire myTire = new Tire();
}
//상위패키지 import했다고 하위패키지까지 import되는 것은 아님 따로 선언해줘야함

//접근제한자 - 클래스와 인터페이스를 다른 패키지에서 사용하지 못하도록 막을 떄 객체 생성을 막기위해 
//생성자 호출하지 못하도록 하기위해
//클래스 접근제한
/*public 접근제한자 - 외부 클래스가 자유롭게 사용 가능
  protrcted 접근제한자 - 같은 패키지 또는 자식 클래스에서 사용가능
  private 접근제한자 - 단어 뜻 그대로 개인적인 것이라 외부사용될 수 없도록
  default 접근제한다 - 위3가지 제한자 적용되지 않는 다면 가짐, 같은 패키지에 소속된 클래스에서만 사용 가능*/
//생성자 접근 제한 - 객체를 생성하기 위해 new연산자로 생성자를 호출함
/*public 접근제한자 - 모든 패키지에서 아무런 제한없이 생성자 호출 가능
  protrcted 접근제한자 - 같은 패키지에 속하는 클래스에서 생성자 호출 가능, 다른 패키지에 속한 클래스가 해당 클래스의 자식 클래스라면 생성자 호출 가능
  private 접근제한자 - 클래스 내부에서만 생성자 호출할 수 있고 객체를 만들 수 있음
  default 접근제한다 - 같은 패키지에서 제한없이 호출가능, 다른 패키지에서 생성자 호출 불가능*/
//필드와 메소드 접근제한
/*public 접근제한자 - 모든 패키지에서 제한 없이 필드와 메소드사용 가능
  protrcted 접근제한자 - 같은 패키지 내에서는 사용가능 다른 패키지에 속한 클래스가 해당 클래스 자식 클래스라면 사용 가능
  private 접근제한자 - 클래스 내부에서만 사용 가능
  default 접근제한다 - 같은 패키지내에서 사용 가능, 다른 패키지에서는 사용 불가능*/

//객체의 필드를 객체외부에서 직접적으로 접근하는 것을 막음(무결성 깨질수 있기때문), 메소드를 통해서 필드를 변경하는 방법 선호
/*setter - 필드는 외부에서 접근 막고 메소드는 공개해서 메소드로 접근하도록 유도
(검증된 값만 필드로 저장하기위해)이 역할을 하는 메소드가 setter*/
void setSpeed(double speed){
    if(speed<0){
        this.speed = 0;
        return;
    }
    else {
        this.speed = speed;
    }
}
/*getter - 외부에서 객체의 데이터를 읽을 때도 메소드 사용하는 것이 좋음
    메소드로 필드값 가공한 후 외부전달하는 메소드가 getter*/
double getSpeed(){
    double km = speed*1.6;
    return km;
}
//사용
private 타입 fieldName;
public 리턴 타입 getFieldName(){ //getter
    return fieldName;
}
public void setFieldName(타입 fieldName){ //setter
    this.fieldName = fieldName;
}

//상속: 이미 개발된 클랫를 재사용해서 새로운 클래스를 만들기 때문에 중복코드 줄여줌
//클래스 상속 - 자식이 부모를 선택, 자식클래스를 선언할 때 어떤 부모 클래스를 상속받을 것인지 결정
class 자식클래스 extends 부모클래스1 {...}
class sprotsCar extends Car{...}
//부모클래스의 private 접근제한 갖는 필드,메소드 상속 대상 제외
public class CellPhone{
    String model;
    String color;
}
public class DmbCellPhone extends CellPhone {
    int channel;
    DmbCellPhone(String model, String color, int channel){
        this.model = model; //CellPhone 클래스로부터 상속받은 필드
        this.color = color; //CellPhone 클래스로부터 상속받은 필드
        this.channel = channel;
    }
}

/*부모 생성자 호출 - 부모객체가 먼저 생성되고 자식 객체가 생성됩니다.
    모든 객체는 생성자를 호출해야만 생성됨, 생성자를 명시적으로 선언하지않으면 
    기본 생성자 super();(부모기본 생성자를 호출) 생성됨
    자식 생성자에서 첫줄에 부모생성자 호출이 이루어져야함*/
super(매개값,...); //부모 생성자중 매개값 타입 일치하는 부모 생성자 호출
public class People{
    public People(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
}
public class myPeople{
    public People(String name, String ssn, int studentNo){
        super(name,ssn);
        this.studentNo = studentNo;
    }
}

//메소드 재정의 - 상속된 일부 메소드는 자식 클래스에서 다시 수정해서 사용해야함, 이런 경우위해 메소드 재정의(오버라이딩)기능 사용
/*방법
    1. 부모의 메소드와 동이한 시그니쳐(리턴 타입,메소드 이름,매개 변수 목록)가져야함
    2. 접근 제한을 더 강하게 재정의 못함
    3. 새로운 예외를 throws할 수 없음
    @Override
메소드 재정의되면 부모객체의 메소드는 숨겨지기 때문에 자식 객체에서 메소드 호출하면 재정의된 자식 메소드 호출됨*/
class Parent {
    void method1(){...}
    void method2(){...}
}
class Child extends Parent {
    void method2(){...} //재정의
    void method3(){...}
}
class ChildE {
    public static void main(String[] args){
        Child.method1();
        Child.method2(); //재정의된 메소드 호출
        Child.method3();
    }
}
//부모 메소드 호출 - 자식 클래스에서 부모 클래스의 메소드 재정의하게 되면 자식 메소드만 사용됨
//super 키워드 사용
super.부모메소드();

//다형성 - 사용 방법은 동일하지만 다양한 객체를 이용해 다양한 실행결과가 나오도록 하는 성질(타이어 어느것 쓰냐 서능다름)
//다형성구현 - 메소드 재정의 + 타입변환
//자동타입변환 - 프로그램 실행도중 자동적으로 타입변환이 일어나는 것
//클래스의 변환은 상속관계있는 클래스사이 일어남
부모타입 변수 = 자식타입; //자동타입변환
Cat cat =new Cat();
Animal animal = cat; //1
Animal animal = new Cat(); //2
//동일 한 Cat객체를 참조, 타입이 Animal이라 부모객체(Animal) 참조가 아닌 Cat객체 참조
//부모가 아니더라도 상속계층에서 상위 타입이라면 자동타입변환 가능
/*부모타입으로 자동 변환이후 부모클래스에 선언된 필드와 메소드만 접근 가능
    변수가 자식객체를 참조하지만 접근 가능한 멤버는 부모클래스 멤버로 한정
    예외로 메소드가 자식클래스에서 재정의되었다면 자식클래스의 메소드가 대신 호출 됨*/
class Parent {
    void method1(){...}
    void method2(){...}
}
class Child extends Parent{
    void method2(){...} //재정의
    void method3(){...}
}
class ChildE {
    public static void main(String[] args){
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
        parent.method3(); //호출불가능
    }
}
//자동 타입변환은 다형성을 구현하기위해 사용
/*자식 클래스는 부모 메소드를 재정의해서 메소드의 실행 내용을 변경함으로써 더 우수한 시행결과가 나오게 할 수 있음*/
class Car {
    Tire frontLeftTire = new Tire();
    Tire frontRightTire = new Tire();
    Tire backLeftTire = new Tire();
    Tire backRightTire = new Tire();
    void run(){...}
}
Car myCar = new Car();
myCar.frontRightTire = new HankookTire(); //교체
myCar.backLeftTire = new KumhoTire();     //교체
myCar.run();
//frontRightTire,backLeftTire에 Tire객체의 자식 객체저장되어도 됨(Tire의 필드 메소드 들고있기때문)
//Car의 run() 수정하지않고 다양한 값을 얻을 수있음

//매개변수의 다형성 - 매개값을 다양화하기 위해 매개변수에 자식 객체를 지정할 수도 있음
class Driver {
    void drive(Vehicle vehicle){
        vehicle.run();
    }
}
Driver diriver = new Driver();
Vehicle vehicle = new vehicle();
driver.driver(vehicle);
//Vehicle의 자식클래스Bus 객체를 drive()메소드의 매개값으로 주면 자동타입변환 일어남
Driver diriver = new Driver();
Bus bus = new Bus();
driver.driver(bus); // Vehicle vehicle = bus; 자동타입변환 발생
//매개변수의 타입이 클래스일 경우 - 해당 클래스, 자식 객체 까지도 사용 가능(매개값으로 어떤 자식 객체가 제공되냐 따라 실행결과 다양해짐)
public class Vehicle {
    public void run(){
        System.out.println("차량");
    }
}
public class Driver {
    public void drive(Vehicle vehicle){
        vehicle.run();
    }
}
public class Bus extends Vehicle {
    @Override
    public void run(){
        System.out.println("버스");
    }
}
public class Taxi extends Vehicle {
    @Override
    public void run(){
        System.out.println("택시");
    }
}
public class DriverE {
    public static void main(String[] args){
        Driver driver = new Dricer();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        driver.drive(bus); //자동타입변환 Vehicle vehicle = bus;
        driver.drive(taxi); //자동타입변환 Vehicle vehicle = taxi;
        }
}

//강제타입변환 - 부모타입을 자식타입으로 변환하는 것
//자식 타입이 부모 타입으로 자동 타입 변환한 후 다시 자식 타입으로 변환할때 강제 타입 변환 사용 가능
Parent parent = new Child();
Child child = (Child) parent;
//자식에 선언된 필드와 메소드를 꼭 사용해야한다면 강제 타입 변환을 해서 사용해야함
//객체타입확인 - instanceof 연산자 사용
boolean result = 좌항(객체) instanceof 우항(타입)
public void method(Parent parent){
    if(parent instanceof Child){
        Child child = (Child) parent;
    }
}
