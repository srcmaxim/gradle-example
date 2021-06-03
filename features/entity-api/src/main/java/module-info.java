module myproduct.features.entity.api {
    requires transitive myproduct.domain.entities;
    requires transitive myproduct.domain.avro.events;
    exports com.example.service.entity.api;
}