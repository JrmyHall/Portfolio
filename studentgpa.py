student = dict()
n = int(input("Enter number of students :"))
for i in range(n):
    student_name = input("Enter names of student :")
    courses = []
    for j in range(4):
        course = input("Enter Course names: ")
        courses.append(course)
    grades = []
    for k in range(4):
        grade = input("Enter letter grade for each course: ")
        grades.append(grade)
    credit_hours = []
    for l in range(4):
        credit_hour = float(input("Enter credit hours for each course: "))
        credit_hours.append(credit_hour)
    student[student_name] = courses, grades, credit_hours
print(student)
        
                       

def toConvert(grades):
    points = 0
    i = 0
    grade_c = {"A":4, "B":3.0, "C":2.0, "D":1.0, "F":0}
    if grades != []:
        for grade in grades:
            points += grade_c[grade]
        gpa = points / len(grades)
        return gpa
    else:
        return None
 
 

print(toConvert(grades))
 


def calGpa
    

