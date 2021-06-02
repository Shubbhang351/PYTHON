import tkinter as tk
import os,pyautogui,time,datetime

class Application(tk.Frame):
    def __init__(self, master=None):
        super().__init__(master)
        self.master = master
        self.pack()
        self.create_widgets()

    def create_widgets(self):
        self.hi_there = tk.Button(self)
        self.hi_there["text"] = "screenshot"
        self.hi_there["command"] = self.say_hi
        self.hi_there.pack(side="top")

        

    def say_hi(self):
        global final_path

        time = str(datetime.datetime.today().strftime('%H-%M-%S'))

        date = str(datetime.date.today())

        name =  time + "_" + date + '.png'

        final_name = final_path + '\\' + name
        
        myScreenshot = pyautogui.screenshot()

        myScreenshot.save(final_name)

        print("hi there, everyone!")

root = tk.Tk()
path = os.getcwd()
folder = 'MY_Screenshots'

check = os.path.isdir(folder)

if not check:
    os.makedirs(folder)
else:
    pass

final_path = os.path.join(path,folder)

app = Application(master=root)
app.mainloop()