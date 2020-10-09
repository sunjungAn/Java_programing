## inheritance(상속)

### 상속 
  + 상위 클래스의 특성을 하위 클래스에 물려주는 것
  + 슈퍼 클래스 : 상위클래스
  + 서브 클래스 : 물려받는 하위 클래스
  
    + 슈퍼클래스에서 자신만의 특성을 추가할 수 있다.
    + 슈퍼클래스의 특성을 수정할 수 있다. 
  
  + 하위 클래스로 갈 수록 구체적이다. 
  
  
### 상속 선언 방법
  + extends를 사용한다. 
  
    <img width="477" alt="캡처" src="https://user-images.githubusercontent.com/55094745/95548781-c5581180-0a40-11eb-846e-a650473af295.PNG">

  + 클래스 다중 상속을 지원하지 않는다!
  + 상속 횟수는 무제한이며 최상위 클래스는 object클래스이다. 
 
 
### 객체와 멤버 사용
  
  + 슈퍼 클래스의 private멤버는 상속되지만 서브 클래스에서 직접 접근은 불가능하다. 
  + 접근 방법은 슈퍼 클래스의 public/protected 메소드를 통해 접근이 가능하다. 
  
   ![image](https://user-images.githubusercontent.com/55094745/95550412-cfc7da80-0a43-11eb-98b5-cb8c38da2178.png)
   
  
  
