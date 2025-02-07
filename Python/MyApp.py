import sys
from PyQt5.QtWidgets import QApplication, QWidget, QPushButton

class MyApp(QWidget):
    def __init__(self):
        super().__init__()
        self.initUI()

    def initUI(self):
        btn = QPushButton('클릭하세요!', self)
        btn.clicked.connect(lambda: print("버튼 클릭됨!"))
        btn.move(100, 80)

        self.setWindowTitle('PyQt 예제')
        self.setGeometry(300, 300, 300, 200)
        self.show()

app = QApplication(sys.argv)
ex = MyApp()
sys.exit(app.exec_())