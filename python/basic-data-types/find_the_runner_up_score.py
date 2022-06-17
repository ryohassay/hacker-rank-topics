if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr_list = list(arr)
    arr_list.sort(reverse=True)
    max  = arr_list[0]
    for item in arr_list:
        if item != max:
            print(item)
            break
