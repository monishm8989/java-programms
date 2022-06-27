class Std:
    def __int__(self,name,id):
        self.name=name
        self.id=id
    def Show(self):
        print(self.id,self.name)
std1=Std("mohan",23)
std2=Std("kalyan",32)
std1.Show()
std2.Show()