# Task
# Given an integer, `n`, and  space-separated integers as input, create a tuple, `t`, of those  integers. Then compute and print the result of `hash(t)`.

# Note: hash() is one of the functions in the __builtins__ module, so it need not be imported.

# Input Format
# The first line contains an integer, `n`, denoting the number of elements in the tuple.
# The second line contains  space-separated integers describing the elements in tuple .

# Output Format
# Print the result of `hash(t)`.


# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
# list_nums = [int(num) for num in input().split()]
list_nums = map(int, input().split())
tuple_nums = tuple(list_nums)
# print(tuple_nums)
print(hash(tuple_nums))
