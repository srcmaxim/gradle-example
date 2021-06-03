module myproduct.features.cat {
    requires transitive myproduct.features.cat.api;
    requires spring.beans;
    requires spring.context;
    exports com.example.service.cat;
    opens com.example.service.cat to spring.core;
}