module myproduct.features.entity {
    requires transitive myproduct.features.entity.api;
    requires spring.beans;
    requires spring.context;
    exports com.example.service.entity;
    opens com.example.service.entity to spring.core;
}