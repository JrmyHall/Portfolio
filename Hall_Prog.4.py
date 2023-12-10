
cost = float(input("Enter the purchase price: "))
getDiscount = str(input("Are you a student, veteran, or no?"))

if getDiscount == "student":
    discount = 0.07
    print("You get 7% off!")
elif getDiscount == "veteran":
    discount = 0.12
    print("You get 12% off!")
elif getDiscount == "no":

    endif 
        
        

                  

monthNum=1 
interestRate = 0.12
dPay = cost*0.10 
studentDiscount = 0.07
veteranDiscount = 0.12

mPay = (cost-dPay)*0.05
curBal = cost-dPay


print("{:14s}{:19s}{:19s}{:19s}{:19s}{:19s}".format("Month", "Current Balance","Interest","Principal", "Month Payment","Balance"))


while curBal>0:  
    
    if curBal<mPay: 
        
        interestAmount=0 
        
        principal =curBal 
        pay=curBal 
        finalBal=0 
    
    
    else: 
        
        
        interestAmount=curBal*(interestRate/12)
        
       
        principal=mPay - interestAmount 
        
       
        pay=interestAmount+principal 
        
         
        finalBal=curBal-principal  
    
    
    print("{:<14d}{:<19.2f}{:<19.2f}{:<19.2f}{:<19.2f}{:<19.2f}".format(monthNum,curBal,interestAmount,principal,pay,finalBal)) 
    
   
    curBal=finalBal 
    
    
    monthNum=monthNum+1 
