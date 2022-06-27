class Pare:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def print(self):
        print(self.name,self.age)
class Child1(Pare):
    def __init__(self,mark,roll):
        self.mark=mark
        self.roll=roll
    def disp(self):
        print(self.mark,self.roll)
emp1=Child1(22,"testing")
emp2=Pare("purush",22)
emp1.disp()
emp2.print()





