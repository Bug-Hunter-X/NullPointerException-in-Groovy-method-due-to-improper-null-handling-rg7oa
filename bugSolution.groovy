```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return 0 //Correct handling of null
        } else if (param instanceof String) {
            return param.length()
        } else {
            return -1 //Handle cases where param is not a String
        }
    }
}
```