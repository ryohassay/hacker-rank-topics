if __name__ == '__main__':
    N = int(input())
    desig_coms = ["insert", "print", "remove", "append", "sort", "pop", "reverse"]
    nums = []

    for i in range(N):
        commands = [command for command in input().split()]
        com = commands[0]

        if commands[0] == 'print':
            line = 'print'
            print(nums)
        elif len(commands) == 1:
            line = 'nums.' + commands[0] + '()'
            exec(line)
        elif len(commands) == 2:
            line = 'nums.' + commands[0] + '(' + commands[1] + ')'
            exec(line)
        elif len(commands) == 3:
            line = 'nums.' + commands[0] + '(' + commands[1] + ', ' + commands[2] + ')'
            exec(line)    
