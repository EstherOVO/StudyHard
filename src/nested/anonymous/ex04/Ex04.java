package nested.anonymous.ex04;

public class Ex04 {
    public static void main(String[] args) {

/*
        문제 4. CheckBox 이벤트 실행

        중첩 인터페이스가 내부에 선언된 CheckBox 클래스가 아래와 같이 있습니다.
        체크박스가 선택되었을 때 "배경을 변경합니다"라고 실행되는
        리스너를 클래스와 익명 객체로 각각 만들어보세요.

        public class CheckBox {
            OnSelectListener listener;

            void setOnSelectListener(OnSelectListener listener) {
                this.listener = listener;
            }

            void select() {
                listener.onSelect();
            }

            static interface OnSelectListener {
                void onSelect();
            }
        }
*/

        CheckBox checkBox = new CheckBox();

//      클래스를 만든 경우
        var listener = new ChangeBackgroundSelectListener();
        checkBox.setOnSelectListener(listener);
        checkBox.select();

//      익명 인터페이스로 리스너를 설정한 경우
        checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
            @Override
            public void onSelect() {
                System.out.println("배경을 변경합니다!(익명)");
            }
        });

        checkBox.select();
    }
}
