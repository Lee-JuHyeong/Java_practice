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
