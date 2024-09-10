module module.b {
    requires module.a;
    provides com.test.Test with com.main.TestImpl;
}