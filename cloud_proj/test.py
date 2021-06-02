import requests

url = 'https://skin-cancer-detection-api351.herokuapp.com/upload'
my_img = {'image': open('13.jpg', 'rb')}
r = requests.post(url, files=my_img)

print(r.json())

