let randomNumbers = [27, 64, 47, 78, 48, 11, 76, 25, 11, 83];
function findMax(numbers)
{
    let max = numbers[0];
    for(let i=1;i<numbers.length;i++)
    {
        if(numbers[i] > max)
        {
            max = numbers[i];
        }
    }
    console.log("maximum number is: ", max);
}
findMax(randomNumbers);