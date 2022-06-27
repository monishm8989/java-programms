class Demo:
    def __init__(self):
        self.__a=10
    def display(self):
        print(self.__a)
    def s(self,b):
        self.__a=b
ob=Demo()
ob.display()
ob.__a=4
ob.display()
ob.s(8)
ob.display()

