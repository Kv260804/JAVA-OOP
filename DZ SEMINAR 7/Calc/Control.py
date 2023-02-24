from View.Menus import *
from Calc.Types.Rational import Rational
from Calc.Types.Complex import Complex


def run():
    while True:
        type_choice = input(f"{choice_type_values} > ")
        if type_choice == "1":
            num1 = Rational("First number")
            num2 = Rational("Second number")
        elif type_choice == "2":
            num1 = Complex("First number")
            num2 = Complex("Second number")
        else:
            return 0

        type_operation = input(f"{choice_operation} > ")
        if type_operation == "1":
            num1.summarize(num2)
        elif type_operation == "2":
            num1.subtraction(num2)
        elif type_operation == "3":
            num1.multiplication(num2)
        elif type_operation == "4":
            num1.division(num2)
        elif type_operation == "5":
            continue
        else:
            "Invalid choice, close application"
            return 0

        show_result(num1)