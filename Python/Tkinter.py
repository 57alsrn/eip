import tkinter as tk

# 창 생성
root = tk.Tk()
root.title("Python GUI 예제")
root.geometry("300x200")

# 버튼 추가
btn = tk.Button(root, text="클릭하세요!", command=lambda: print("버튼 클릭됨!"))
btn.pack()

# 창 실행
root.mainloop()