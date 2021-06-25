import PyPDF2
#Now give the pdf name
pdfFileObj = open('12.pdf', 'rb')
pdfReader = PyPDF2.PdfFileReader(pdfFileObj)
print(pdfReader.numPages)

pageObj = pdfReader.getPage(0)

text=(pageObj.extractText())
text=text.split(",")
print(text)