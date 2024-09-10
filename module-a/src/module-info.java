module module.a {
    exports com.test to module.b;
    // requires transitive java.logging;
    opens com.test to module.b;
    uses com.test.Test;
}