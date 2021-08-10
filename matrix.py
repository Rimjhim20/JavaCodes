import numpy as np
x = np.mat([[1,2,4,5],[5,6,7,8],[2,4,7,5]])
sum=0
print("Given matrix is\n",x)
for i in range(4):
    sum = sum+x[2,i]
print("\nSum of the third row is",sum)

# import numpy as np
# x = np.mat([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]])
# sum=0
# print("Given matrix is\n",x)
# for i in range(4):
#     sum = sum+x[2,i]
# print("\nSum of the third row is",sum)