class Human:
    def __init__(self):
        leg_count = 4

    def get_gender(self):
        return "Unknown"


class Man(Human):
    def get_gender(self):
        print("man")


class Woman(Human):

    def get_gender(self):
        print("woman")


aman = Man()
aman.get_gender()

awoman = Woman()
awoman.get_gender()
