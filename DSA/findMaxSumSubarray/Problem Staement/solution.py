def find_max_sum_subarray(arr):
    if not arr:
        raise ValueError("Array must not be empty")

    current_max = arr[0]
    global_max = arr[0]

    for num in arr[1:]:
        current_max = max(num, current_max + num)
        global_max = max(global_max, current_max)

    return global_max

# Example usage
arr = [1, -2, 3, 4, -1, 2, 1, -5, 4]
print("Maximum Sum Subarray:", find_max_sum_subarray(arr))
