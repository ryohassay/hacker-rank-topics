if __name__ == '__main__':
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])

    size = len(students)
    min_indeces = [0]
    min_score = students[0][1]
    for i in range(1, size):
        if students[i][1] < min_score:
            min_indeces = [i]
            min_score = students[i][1]
        elif students[i][1] == min_score:
            min_indeces.append(i)

    students_no_lowest = [students[i] for i in range(size) if i not in min_indeces]
    sec_indeces = [0]
    sec_score = students_no_lowest[0][1]
    for i in range(1, len(students_no_lowest)):
        if students_no_lowest[i][1] < sec_score:
            sec_indeces = [i]
            sec_score = students_no_lowest[i][1]
        elif students_no_lowest[i][1] == sec_score:
            sec_indeces.append(i)

    names = sorted([students_no_lowest[idx][0] for idx in sec_indeces])
    for name in names:
        print(name)
