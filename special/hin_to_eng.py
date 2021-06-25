from googletrans import Translator
import pyttsx3



def speak(text):
    engine = pyttsx3.init()
    engine.say(text)
    engine.runAndWait()

translator = Translator()

result = translator.translate('mujhai nahi pta hai',src = 'hi', dest = 'en')

print(result.src)
print(result.dest)
print(result.origin)
print(result.text)
print(result.pronunciation)

speak(result.text)
speak(result.src)