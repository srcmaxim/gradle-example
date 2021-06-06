module myproduct.features.cat.api {
    requires transitive myproduct.domain.avro.events;
    exports com.example.service.cat.api;
}