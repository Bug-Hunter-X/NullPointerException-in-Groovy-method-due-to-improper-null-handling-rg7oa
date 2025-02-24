```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return 0 //Incorrect handling of null
        }
        return param.length()
    }
}
```