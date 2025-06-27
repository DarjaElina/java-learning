package PackageTwo;

import PackageOne.ModularClassOne;

public class ModularClassTwo {
    // we want to use method showInfo()
    // from class ModuleOne/PackageOne/ModularClassOne
    public static void main(String[] args) {
        // we cannot just use it
        // without exporting PackageOne inside ModuleOne/module-info.java
        // and requiring it inside ModuleTwo/module-info.java

        ModularClassOne.greeting();
    }
}
