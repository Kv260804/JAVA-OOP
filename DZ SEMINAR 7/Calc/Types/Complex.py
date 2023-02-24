class Complex:
    def __init__(self, msg=""):
        print(msg)
        self.real = float(input("Enter real values: "))
        self.image = float(input("Enter image values: "))
        print()

    def summarize(self, other):
        if type(other) == Complex:
            self.real += other.real
            self.image += other.image

    def subtraction(self, other):
        if type(other) == Complex:
            self.real -= other.real
            self.image -= other.image

    def multiplication(self, other):
        if type(other) == Complex:
            self.real *= other.real
            self.image *= other.image

    def division(self, other):
        if type(other) == Complex:
            self.real /= other.real
            self.image /= other.image

    def get_values(self):
        return f"{self.real if self.real % 1 != 0 else int(self.real)}+" \
               f"{self.image if self.image % 1 != 0 else int(self.image)}i"