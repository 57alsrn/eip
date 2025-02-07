import javax.swing.*;

public class Swing {
    public static void main(String[] args) {
        // 메인 윈도우 프레임 생성
        JFrame frame = new JFrame("Java GUI 예제");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 버튼 추가
        JButton button = new JButton("클릭하세요!");
        frame.add(button);

        // 화면 중앙에 창 배치
        frame.setLocationRelativeTo(null);

        // 창 표시
        frame.setVisible(true);
    }
}