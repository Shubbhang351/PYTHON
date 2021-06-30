import requests

url = 'http://127.0.0.1:4555/upload'
my_img = {'image': open('13.jpg', 'rb')}
r = requests.post(url, files=my_img)

print(r.json())

