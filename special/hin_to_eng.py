from googletrans import Translator
import pyttsx3



def speak(text):
    engine = pyttsx3.init()
    engine.say(text)
    engine.runAndWait()

translator = Translator()

message = 'bhai tu bata de'

result = translator.translate(message,src = 'hi', dest = 'en')

print(result.src)
print(result.dest)
print(result.origin)
print(result.text)
print(result.pronunciation)

speak(result.text)
speak(message)