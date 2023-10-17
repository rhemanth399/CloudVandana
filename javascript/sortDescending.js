// Function to perform descending order sorting
function sortDescending(a, b) {
    return b - a;
}

// Example array
var numbers = [5, 2, 9, 1, 5, 6];

// Sort the array in descending order
numbers.sort(sortDescending);

// Output the sorted array
console.log("Sorted in descending order:", numbers);
