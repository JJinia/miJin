package com.example.study02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // 두번째 스터디
    /*
    * 1. View의 종류에 대해서 알아보기
    *   - TextView, EditText, ImageView, Button, ImageButton, CheckBox, RadioBox
    *   - 각 속성에 대해서 사용 해보기
    *   - 각 View별 차이점에 대해서 알아보기
    *
    * 2. Layout의 종류에 대해서 알아보기
    *   - LinearLayout, RelativeLayout, ConstraintLayout, FrameLayout
    *   - 각 Layout의 특성에 대해서 알아보기
    *   - 각 Layout의 차이점에 대해서 알아보기
    *
    * 3. Layout와 View를 이용하여 실습 진행해 보기
    *
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    /*
    * 1 TextView 의 특징
    *   - Text를 입력한대로 뷰에 나타내줌
    *   - 실행 화면 안에서 입력및 수정 불가능
    * 2. EditText
    *   - Text를 입력받을수 있는 박스를 생성
    *   - 실행 화면 안에서 Text 를 입력및 수정 가능
    * 3. ImageView
    *   - 그림(Image)를 보여줌
    *   - Image size 조절 가능
    * 4. ImageButton
    *   - Button 안에 Image 삽입
    *   - button 의 크기만큼 Image가 보여짐
    * 5. Button
    *   - 기본 click Event 가 있는 Box
    *   - Click Event 는 사용할수도 있고, 없앨수도 있음
    *   - 기본 size가 textview 보다 큼
    * 6. CheckBox
    *   - 선택할수 있는 네모난 BOX
    *   - 중복 선택 가능
    * 7. RadioBox
    *   - 선택할수 있는 동그란 Box
    *   - 한개만 선택 가능
    *   - RadioGroup 으로 묶어 줘야함
    *
    * */

    /*
    * 1. LinearLayout
    *  - 선형으로 배치
    *  - 가로나 세로로 일렬로 나열
    *
    * 2. RelativeLayout
    *  - 특정뷰나 부모에 맞춰 배치
    *
    * * 3. ConstraintLayout
    *  - 제약적으로 배치
    *  - 세세하게 배치 가능
    *
    * * 4. FrameLayout
    *  - 액자처럼 배치
    *  - 겹겹이 쌓이면서 제일 위에 있는 뷰가 사용자에게 보임
    * */
}