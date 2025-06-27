package PackageThree;

// import PackageOne.ModularClassOne;

public class ModularClassThree {
    public static void main(String[] args) {
        // ModuleOne allows access only to ModuleTwo
        // via this line inside ModuleOne/module-info.java:
        // exports PackageOne to ModuleTwo;

        // so we cannot use its classes here
        // even if we require
        // ModularClassOne.greeting(); ❌ error
    }
}
