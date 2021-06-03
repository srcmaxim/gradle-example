module myproduct.domain.avro.events {
    requires org.apache.avro;
    requires com.fasterxml.jackson.core;
    exports com.example.domain.event;
    opens com.example.domain.event to org.apache.avro;
}