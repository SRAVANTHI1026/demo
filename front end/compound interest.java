function calculateCompoundInterest(principal, rate, timesCompounded, years) {
    // Convert the rate from percentage to decimal
    let r = rate / 100;
    // Compound interest formula: A = P(1 + r/n)^(nt)
    let amount = principal * Math.pow((1 + r / timesCompounded), timesCompounded * years);
    // Interest earned
    let interest = amount - principal;
    return {
        amount: amount.toFixed(2),
        interest: interest.toFixed(2)
    };
} 
let result = calculateCompoundInterest(principal, rate, timesCompounded, years);
console.log(`Total Amount: $${result.amount}`);
console.log(`Interest Earned: $${result.interest}`);