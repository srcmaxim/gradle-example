module myproduct.services.app {
    requires static lombok;
    requires static com.github.spotbugs.annotations;
    requires spring.beans;
    requires spring.context;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires myproduct.features.cat;
    requires myproduct.features.entity;
    exports com.example.service.app;
    opens com.example.service.app to spring.core;
}