# miJin
스터디 관련 내용
지금 까지 스터디 한 것 들 정리 

사용 했던 내용 용어 정리 및 특장 점에 대해서 적어보기

1. study01  
  - 함수 선언 및 호출
     > fun 함수이름(변수:자료형,변수:자료형..) { 표현식}
  - if 함수
     > if(조건) { }
       else if (조건) { }
       else { } 
     
  -  When 함수
     > 자바의 switch 함수를 대체
     > when(변수) {
       값 -> println("표현") } 
       else -> println("표현")
  -  for문 (반복문)
     > for 안에 변수를 선언하고, 변수값이 증감하면서 조건에 맞을때까지 반복
     > for (조건 표현식) {  } -> ex) for(i = in 1..10) { sum += i }
  -  list
     > 리스트를 만들 때 사용하는 함수
     > val list= listOf(1,2,3) 형식으로 선언



2. study02
  - View의 종류에 대해서 알아보기 (View : 화면에 보이는 모든 요소의 최상위 클래스) 
     > TextView
        = 텍스트를 표시
        = 속성 : - text 텍스트를 정함
                 - testSize 텍스트의 크기
                 - textStyle 텍스트의 스타일을 정함
                 - textColor 텍스트의 색깔 등등...
     > EditText
        = 텍스트를 입력 받는 위젯
        = 속성 : - gravity 텍스트가 배치 될 위치
                 - inputType 입력 받는 값의 형태 (text,number)
                 - hint 입력전에 볼 수 있는 텍스트
              
     > ImageView
        = 지정한 이미지를 보여줌
        = 색만 지정하여 칠 할 수도 있음
        = 속성 : - background 이미지 뷰의 배경색
                 - src 선택한 이미지를 뷰에 담음
     > Button
        = 클릭하여 입력값을 주는 위젯
        = 속성 : - backgroundTint 버튼의 색상
                 - text 버튼에 쓰여 질 텍스트
                 - textAllCaps 쓰여진 텍스트를 대문자로 표시
     > ImageButton
        = 버튼에 이미지를 담을 수 있음
        = 속성 : - scr 버튼에 쓰여질 이미지 지정
                 -  background 배경색
                 -  scalType = "fitCenter" 사이즈가 맞지 않는 이미지의 크기를 자동으로 조절

    - Layout의 종류에 대해서 알아보기
      >LinearLayout
        = 가로(수평) 나 세로(수직) 방향으로 일열로 나열 할 때 사용
        = 뷰의 위치를 지정하지 않아도 중첩되지 않고 자동으로 나열
        = 속성 : - orientation > horizontal, vertical 나열 방향
                 - weight > 가중치(비율)
      
      >RelativeLayout
        = 뷰를 특정 뷰나 부모의 위치에 맞게 배치 가능
        = 연결고리가 있어 서로 연결되어 위치가 결정
        = 속성 : 1. 뷰로 설정 
                    - layout_toRightOf (leftOf) = "@" 뷰의 오른쪽(왼쪽)
                    - layout_aboveOf (belowOf)  "@" 뷰의 위(아래)
                    - layout_tostartOf (EndOf)  "@" 뷰의 시작부분(끝부분)
                    - layout)alignRight (Lef,Top,Bottom,Baseline) "@" 뷰의 오른쪽으로 정렬
                                                                      (왼쪽,위쪽,아래쪽,기본라인)
                2. trhe/false 값으로 설정
                    - layout_alignparentRight(Left,Top...) ="true" 부모의 오른쪽/왼쪽/위쪽/아래쪽
                    - layout_centerinParent="true" 부모의 가운데
                    - layout_centerHorizontal(Vertical) ="true" 부모의 수평가운데/수직가운데
      
      >ConstraintLayout
        = 뷰의 위치를 강제적으로 지정
        = 속성 : - layout_constraint[위치1]_to[위치2]Of = "[대상]"
  
      >FrameLayout
        = 액자처럼 배치 
        
        
        
3. study03
  - 지역변수 : 일정한 또는 지정된 지역에서만 사용할 수 있는 특정한 변수
  
  - 전역변수 : 모든 영역에서 사용할 수 있는 변수
  
  - Collection 종류 < Immutable (불변) , Mutable (가변)
      > List 특징 : 데이터를 저장하거나 삭제될 때 순서를 지킴 
             종류 : mmutable = listOf / Mutable = mutableListOf
     
      > Map 특징 : key, value가 쌍으로 지정 key는 중복 불가능 / value는 중복 가능
            종류 : Immutable = mapOf / Mutable = mutableMapOf
     
      > Set 특징 : 데이터의 중복이 불가능 , 순서가 정해져 있지 않음
            종류 : Immutable = setOf / Mutable = mutableSetOf
            
            
4. study04
  -
