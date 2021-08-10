d=1
def num(n):
    count=0
    while(n>0):
        if(n%10==d):
            count=count+1
            n=n//10
            return count
            
            def num(n):
                count =0
                for i in range (0,n+1):
                    count=count+num(i)
                    return count
                    
                    num(2)