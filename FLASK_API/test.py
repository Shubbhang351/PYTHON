import requests

BASE = "http://127.0.0.1:5000/"

data = [{"likes" : 108,"name" : "tech with shubh", "views" : 1000},
        {"likes" : 28,"name" : "tech with hitesh", "views" : 2},
        {"likes" : 5,"name" : "tech with jai", "views" : 6}]

for i in range(len(data)):
    response = requests.put(BASE + "video/" + str(i), data[i])
    print(response.json())


response = requests.delete(BASE + "video/0")
print(response)

j = input()

response = requests.get(BASE + "video/" + str(j))
print(response.json())