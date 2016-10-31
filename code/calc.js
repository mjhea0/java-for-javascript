/*

  1. add()
  1. subtract()
  1. multiply()
  1. divide()

 */

var Calculator = function(num1, num2) {
  this.num1 = num1;
  this.num2 = num2;
};

Calculator.prototype.add = function () {
  return this.num1 + this.num2;
};

Calculator.prototype.subtract = function () {
  return this.num1 - this.num2;
};

Calculator.prototype.multiply = function () {
  return this.num1 * this.num2;
};

Calculator.prototype.divide = function () {
  return this.num1 / this.num2;
};

var testCalc = new Calculator(3, 2);
console.log(testCalc.add());
console.log(testCalc.subtract());
console.log(testCalc.multiply());
console.log(testCalc.divide());
