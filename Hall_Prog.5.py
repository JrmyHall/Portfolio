"""
Program: Hall_Prog.#5
Author: Jeramy Hall
The purpose of this program is to calculate miles per gallon in a loop then
use -1 to exit. Program will take all the miles per gallons to print an average.
"""
gallons = int
miles = int
result=[]#declare empty list

while (gallons != -1): #loop until break
    gallons = float(input("enter the gallons used(-1 to end)")) #input from user for gallons
    miles = float(input("enter the miles")) #input from user miles
    if gallons < 0 : break
    mpg = miles/gallons #calculate miles per gallon
    print("The miles/gallon for this tank is ", round(mpg, 2)) #print miles per gallon
    result.append(mpg) #add the miles per gallon to list
tankAvg = sum(result) / len(result) #get the average Miles Per Gallon of the list
print("The overall average miles/gallon was",round(tankAvg, 2)) #display the tank average rounded 2 decimals

