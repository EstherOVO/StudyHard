package nested.anonymous.ex04;

public class ChangeBackgroundSelectListener implements CheckBox.OnSelectListener {
    @Override
    public void onSelect() {
        System.out.println("배경을 변경합니다!");
    }
}
