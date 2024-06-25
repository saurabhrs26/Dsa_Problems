function sayHello(){
    return "Hello " + this.name;
  }
          
  var obj = {name: "Sandy"};
          
  console.log(sayHello.call(obj));