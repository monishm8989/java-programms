class Empe:
    def __init__(self, name, age):
        self.name = name
        self.age = age


    def display(self):
        print(self.name,self.age)


emp1 = Empe("moni", 21)
emp2 = Empe("moha", 22)
emp1.display()
emp2.display()

