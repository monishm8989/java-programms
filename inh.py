'''class A:
    def test(self):
        print("from test")
class B:
    def test1(self):
        print("from test1")
class c(A,B):
    def test2(self):
        print("from test2")
c1=c()
c1.test()
c1.test1()
c1.test2()
print(issubclass(c,B))
print(issubclass(A,B))
print(issubclass(c,A))'''
#method overriding
'''class Father:
    def transport(self):
        print("bike")
class son(Father):
    def transport(self):
        print("car")
obj=son()
obj.transport()'''
class p1:
    def __init__(self,name):
        self.name=name
    def display(self):
        print("kumar")
class p2(p1):
    def __init__(self,age):
       super().__init__("hello")
    def display(self):
        print("world")
class c(p2):
    def __init__(self,id):
        super().__init__("done")
    def display(self):
        print("prefect")
obj =p2(22)
obj1=c(18)
obj.display()
obj1.display()




