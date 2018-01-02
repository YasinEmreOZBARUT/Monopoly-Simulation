#from docx import Document
import operator
from wordcloud import WordCloud
from os import path

class Calculate():
    def __init__(self):
        self.frequency = {}
        self.tf = {}
    def control_words(self, words):
        stopwords = open("useless.txt").read().strip().split("\n")
        for word in words:
            if word not in stopwords:
                self.frequency[word] = self.frequency.get(word, 0) + 1
        return self.frequency

    def sorting(self):
        sortedlisted = [(self.frequency[key], key) for key in self.frequency]
        sortedlisted.sort()
        sortedlisted.reverse()
        return [sortedlisted[i] for i in range(50)]

    def calculate_tf(self):
        for (key, value) in self.frequency.items():
            self.tf[key] = self.frequency[key] / float(len(self.frequency.keys()))
class Read(object):
    def read_from_file(self):
        readeded = None
        print('choose your file type : for txt = 1 , for docx = 2 , for pdf = 3')
        girilen = int(input('please select your decision : '))

        if (girilen == 1):
            fname = input('enter a txt file name : ')
            with open(fname) as file:
                readeded = (file.read().rstrip().split())
        elif (girilen == 2):
            fname2 = input('enter a docx file name : ')
            with open(fname2) as file2:
                readeded = None
        else:
            pass

        return readeded


class Write(object):
    def write_to_csv(self, freq):
        with open("td.csv", "w") as file:
            for (key, value) in freq:
                file.write(key + "," + str(value) + "\n")

if __name__ == '__main__':
    obje = Calculate()
    obje3 = Read()
    writeDoc = Write()

    readed = obje3.read_from_file()
    print(readed)

    obje.control_words(readed)
    sortedvalues = (obje.sorting())
    print("Our sorted words are := ")
    print(sortedvalues)
    obje.calculate_tf()
    print("Our tf ")
    print(obje.tf)
    sorted = sorted(obje.tf.items(), key=operator.itemgetter(1), reverse=True)[:50]
    writeDoc.write_to_csv(sorted)
    text = " ".join(obje.tf.keys())
    wordcloud = WordCloud().generate(text)
    image = wordcloud.to_image()
    image.show()