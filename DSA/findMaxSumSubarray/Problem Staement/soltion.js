function findMaxSumSubarray(arr) {
    if (arr.length === 0) {
        throw new Error("Array must not be empty");
    }

    let currentMax = arr[0];
    let globalMax = arr[0];

    for (let i = 1; i < arr.length; i++) {
        currentMax = Math.max(arr[i], currentMax + arr[i]);
        globalMax = Math.max(globalMax, currentMax);
    }

    return globalMax;
}

// Example usage
const arr = [1, -2, 3, 4, -1, 2, 1, -5, 4];
console.log("Maximum Sum Subarray:", findMaxSumSubarray(arr));
