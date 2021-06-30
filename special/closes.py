import PySimpleGUI as sg
import psutil
print(psutil.sensors_battery())
# sbattery(percent=0.0, secsleft=-1, power_plugged=None)
print(psutil.sensors_battery().power_plugged)
# None

sg.theme("Dark")

layout = [[sg.Text("Battery is getting low, please plug in charger otherwise \nlaptop will shut down in next 2 minutes")], [sg.Button("OK")]]

# Create the window
window = sg.Window('Battery concern', layout)

# Create an event loop
while True:
    event, values = window.read()
    if event == "OK" or event == sg.WIN_CLOSED:
        break

window.close()